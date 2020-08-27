package rhx.leetcode.problems1150to1159;

public class P1155NumberOfDiceRollsWithTargetSum {

    public int numRollsToTarget(int dice, int face, int target) {
        int[] dp0 = new int[target + 1];
        dp0[0] = 1;

        for (int d = 0; d < dice; ++d) {
            int[] dp1 = new int[target + 1];
            for (int i = 0; i < dp1.length; ++i) {
                for (int f = 1; f <= face; ++f) {
                    if (i + f <= target)
                        dp1[i + f] = (dp1[i + f] + dp0[i]) % (1000_000_000 + 7);
                }
            }
            dp0 = dp1;
        }

        return dp0[target];
    }

}
