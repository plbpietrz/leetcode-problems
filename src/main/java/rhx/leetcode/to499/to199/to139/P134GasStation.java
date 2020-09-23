package rhx.leetcode.to499.to199.to139;

public class P134GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int inTank = 0;
        int result = 0;
        int total = 0;
        for (int i = 0; i < gas.length; ++i) {
            int reserve = gas[i] - cost[i];
            inTank += reserve;
            if (inTank < 0) {
                inTank = 0;
                result = i + 1;
            }
            total += reserve;
        }

        return total < 0 ? -1 : result;
    }

    public int canCompleteCircuit_old(int[] gas, int[] cost) {
        int N = gas.length;
        for (int i = 0; i < N; ++i) {
            gas[i] -= cost[i];
        }

        l1:for (int i = 0; i < N; ++i) {
            for (int j = 0, sum = 0; j < N; ++j) {
                sum += gas[(i + j) % N];
                if (sum < 0) continue l1;
            }
            return i;
        }
        return -1;
    }

}
