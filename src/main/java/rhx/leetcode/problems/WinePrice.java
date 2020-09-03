package rhx.leetcode.problems;

public class WinePrice {

    public int bestWinePrice(int[] prices) {
        int N = prices.length;
        int[][] dp = new int[N][N];

        for (int l = 0; l < N; ++l) {
            for (int i = 0; i + l < N; ++i) {
                int y = N - l;
                dp[i][i+l] = Math.max(
                        y * prices[i] + ((i >= N - 1) ? 0 : dp[i+1][i+l]),
                        y * prices[i+l] + ((i + l - 1 < 0) ? 0 :  dp[i][i+l-1])
                );
            }
        }

        return dp[0][N-1];
    }

    public static void main(String[] args) {
        System.out.println(new WinePrice().bestWinePrice(new int[]{2, 4, 6, 2, 5}));
    }
}
