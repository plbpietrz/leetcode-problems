package rhx.leetcode.to999.to999.to989;

public class P978LongestTurbulentSubarray {

    public int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1) return 1;
        int start = 0;
        int result = 0;

        boolean sign = arr[0] < arr[1];

        for (int i = 1; i<arr.length; i++) {
            if (sign ? arr[i-1] < arr[i] : arr[i-1] > arr[i])
                sign = !sign;
            else {
                int diff = i - start;
                result = Math.max(diff, result);
                start = arr[i-1] == arr[i] ? i : i-1;
            }
        }
        return Math.max(arr.length - start, result);
    }

}
