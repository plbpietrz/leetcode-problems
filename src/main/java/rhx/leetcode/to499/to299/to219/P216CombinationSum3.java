package rhx.leetcode.to499.to299.to219;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P216CombinationSum3 {

    private List<List<Integer>> result;

    public List<List<Integer>> combinationSum3(int k, int n) {
        result = new ArrayList<>();
        LinkedList<Integer> aux = new LinkedList<>();
        for (int i = 1; i < 10; ++i) {
            aux.add(i);
            dfs(k - 1, n - i, aux);
            aux.removeLast();
        }
        return result;
    }

    private void dfs(int k, int n, LinkedList<Integer> lst) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList(lst));
        } else if (k > 0) {
            for (int i = lst.peekLast() + 1; i < 10; ++i) {
                lst.add(i);
                dfs(k - 1, n - i, lst);
                lst.removeLast();
            }
        }
    }

}
