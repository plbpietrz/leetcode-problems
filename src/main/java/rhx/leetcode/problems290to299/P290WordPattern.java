package rhx.leetcode.problems290to299;

import java.util.HashMap;
import java.util.Map;

public class P290WordPattern {

    public boolean wordPattern(String pattern, String str) {
        char[] patt = pattern.toCharArray();
        String[] strs = str.trim().split("\\s+");
        if (patt.length != strs.length) {
            return false;
        } else {

            Map<Object, Integer> seen = new HashMap<>();

            for (int i = 0; i < strs.length; ++i) {
                Character chr = Character.valueOf(patt[i]);
                String st = strs[i];

                if (!seen.containsKey(chr) && !seen.containsKey(st)) {
                    seen.put(chr, i);
                    seen.put(st, i);
                } else if (seen.get(chr) == null || seen.get(strs[i]) == null) {
                    return false;
                } else if (!seen.get(chr).equals(seen.get(strs[i]))) {
                    return false;
                }
            }
        }

        return true;
    }

}
