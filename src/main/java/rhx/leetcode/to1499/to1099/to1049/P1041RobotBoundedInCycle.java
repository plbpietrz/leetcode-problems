package rhx.leetcode.to1499.to1099.to1049;

import java.util.List;

public class P1041RobotBoundedInCycle {

    public boolean isRobotBounded(String instructions) {
        int[] pos = new int[2];
        int[][] dirs = new int[][]{{0, 1}, {-1, 0}, { 0, -1}, {1, 0}};

        int dir = 0;

        char[] seq = instructions.toCharArray();

        for (int i = 0; i < seq.length; ++i) {
            switch (seq[i]) {
                case 'G':
                    pos[0] += dirs[dir][0];
                    pos[1] += dirs[dir][1];
                break;
                case 'L':
                    dir = (dir + 1) % 4;
                    break;
                case 'R':
                    dir = Math.floorMod(dir - 1,4);
                    break;
            }
        }

        return dir != 0 || (pos[0] == 0 && pos[1] == 0);
    }

}
