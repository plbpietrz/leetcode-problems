package rhx.leetcode.to499.to199.to169;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P165CompareVersionNumbers {

    Pattern PAT = Pattern.compile("([0-9]+)");

    public int compareVersion(String version1, String version2) {
        List<Integer> ver1 = toVersionList(version1);
        List<Integer> ver2 = toVersionList(version2);
        int N = Math.max(ver1.size(), ver2.size());
        for (int i = 0; i < N; ++i) {
            int v1 = i < ver1.size() ? ver1.get(i) : 0;
            int v2 = i < ver2.size() ? ver2.get(i) : 0;

            if(v1 == v2) continue;
            else if (v1 < v2) return -1;
            else return 1;
        }
        return 0;
    }

    List<Integer> toVersionList(String version) {
        List<Integer> result = new ArrayList<>();
        Matcher match = PAT.matcher(version);
        while(match.find()) {
            String group = match.group();
            result.add(Integer.parseInt(group));
        }
        return result;
    }

}
