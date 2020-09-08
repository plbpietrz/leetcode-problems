package rhx.leetcode.to999.to899.to839;

public class P835ImageOverlap {

    public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        int diff = 0;
        for (int i = 1 - N; i < N; ++i) {
            for (int j = 1 - N; j < N; ++j) {
                diff = Math.max(diff, mesureDiff(A, B, i, j));
            }
        }

        return diff;
    }

    private int mesureDiff(int[][] A, int[][] B, int offr, int offc) {
        if (offr < 0 || offc < 0) {
            int[][] T = A;
            A = B;
            B = T;
            offr = Math.abs(offr);
            offc = Math.abs(offc);
        }
        int result = 0, N = A.length;
        for (int r = offr; r < N; ++r) {
            for (int c = offc; c < N; ++c) {
                if ((A[r][c] + B[(r - offr) % N][(c - offc) % N]) == 2)
                    result += 1;
            }
        }
        return result;
    }

}
