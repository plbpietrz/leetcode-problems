package rhx.leetcode.problems1420to1429;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class P1424DiagonalTraverse2 {

    public int[] findDiagonalOrder1(List<List<Integer>> nums) {
        List<Integer> result = new ArrayList<>();
        // upper diagonal
        int lowerBound = 0;
        int N = nums.size();
        for (int i = 0; i < N; ++i) {

            lowerBound = Math.max(lowerBound, nums.get(i).size());

            for (int j = 0; j <= i; ++j) {
                if (nums.get(i-j).size() > j)
                    result.add(nums.get(i-j).get(j));
            }
        }
        // lower diagonal

        for (int i = 1; i < lowerBound; ++i) {
            for (int j = N - 1; j >= 0; --j) {
                if (nums.get(j).size() > (N - 1 - j + i))
                    result.add(nums.get(j).get(N - 1 - j + i));
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] findDiagonalOrder2(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        int max = 0;
        for (int i = nums.size() - 1; i >= 0 ; --i) {
            for(int j = 0; j < nums.get(i).size(); ++j) {
                max = Math.max(max, i+j);
                map.computeIfAbsent(i+j, ArrayList::new).add(nums.get(i).get(j));
            }
        }

        return IntStream.range(0,max+1)
                .mapToObj(i -> map.get(i))
                .flatMap(List::stream)
                .mapToInt(i -> i)
                .toArray();
    }

}
