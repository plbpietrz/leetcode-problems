package rhx.leetcode.to999.to799.to769;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P763PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        int[][] aux = new int[26][2];
        for (int i = 0; i < aux.length; ++i) {
            aux[i][0] = Integer.MAX_VALUE;
        }
        
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            int idx = chars[i] - 97;
            if (aux[idx][0] == Integer.MAX_VALUE) {
                aux[idx][0] = i;
            }
            aux[idx][1] = i;
        }
        
        Arrays.sort(aux, Comparator.comparing(e -> e[0]));
        
        List<Integer> result = new ArrayList<>();
        int min = 0, max = aux[0][1];
        for (int i = 1; i < aux.length; ++i) {
            int[] ch = aux[i];
            
            if (ch[0] == Integer.MAX_VALUE) {
                break;
            } else if (max < ch[0]) {
                result.add(max - min + 1);
                min = ch[0];
                max = ch[1];
            } else {
                max = Math.max(max, ch[1]);
            }
        }
        result.add(max - min + 1);
        
        return result;
    }

}
