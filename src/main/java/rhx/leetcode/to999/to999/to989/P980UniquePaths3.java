package rhx.leetcode.to999.to999.to989;

public class P980UniquePaths3 {

    private int maxPathLen;
    private int numOfPaths;
    private int[][] grid;

    private int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        int startR = 0, startC = 0;
        for (int r = 0; r < grid.length; ++r) {
            for (int c = 0; c < grid[0].length; ++c) {
                if (grid[r][c] == 1) {
                    startR = r;
                    startC = c;
                } else if (grid[r][c] == 0) {
                    maxPathLen += 1;
                }
            }
        }

        dfs(startR, startC, 0);
        return numOfPaths;
    }

    void dfs(int startR, int startC, int len) {
        //System.out.print(" " + startR + ":" + startC);
        for (int i = 0; i < dirs.length; ++i) {
            int r = dirs[i][0] + startR;
            int c = dirs[i][1] + startC;

            if (isValid(r, c)) {
                if (grid[r][c] == 2 && len == maxPathLen) {
                    numOfPaths++;
                } else if (grid[r][c] == 0) {
                    grid[r][c] = 5;
                    dfs(r, c, len + 1);
                    grid[r][c] = 0;
                }
            }
        }
    }

    private boolean isValid(int r, int c) {
        return
                0 <= r && r < grid.length &&
                        0 <= c && c < grid[0].length;
    }

}
