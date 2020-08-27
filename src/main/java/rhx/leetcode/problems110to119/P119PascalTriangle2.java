package rhx.leetcode.problems110to119;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P119PascalTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return List.of(1);
        if (rowIndex == 1) return List.of(1,1);
        int[] arr = new int[rowIndex+1];

        for (int i = 0; i < rowIndex+1; ++i)
            arr[i] = binom(rowIndex, i);
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
    private int binom(int n, int k) {
        return (int)(fact(n)/(fact(k)*fact(n-k)));
    }

    private long fact(int i) {
        int sum = 1;
        while (i > 0) {
            sum *= i;
            --i;
        }
        return sum;
    }

    public static void main(String[] args) {
        new P119PascalTriangle2().getRow(13);
    }

}
