package rhx.leetcode.problems1090to1099;

import java.util.LinkedList;
import java.util.Queue;

public class P1091ShortesPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        boolean[][] visit = new boolean[grid.length][grid[0].length];

        Queue<Coord> queue = new LinkedList<>();
        if (grid[0][0] == 0) {
            queue.offer(new Coord(0, 0, 1));
            visit[0][0] = true;
        }


        while (!queue.isEmpty()) {
            Coord coord = queue.poll();


            if (coord.r == grid.length - 1 && coord.c == grid[0].length - 1)
                return coord.p;

            if (coord.r - 1 > 0) {
                if (coord.c - 1 > 0 && !visit[coord.r - 1][coord.c - 1] && grid[coord.r - 1][coord.c - 1] == 0) {
                    queue.offer(new Coord(coord.r - 1, coord.c - 1, coord.p + 1));
                    visit[coord.r - 1][coord.c - 1] = true;
                }
                if (!visit[coord.r - 1][coord.c] && grid[coord.r - 1][coord.c] == 0) {
                    queue.offer(new Coord(coord.r - 1, coord.c, coord.p + 1));
                    visit[coord.r - 1][coord.c] = true;
                }
                if (coord.c + 1 < grid[0].length && !visit[coord.r - 1][coord.c + 1] && grid[coord.r - 1][coord.c + 1] == 0) {
                    queue.offer(new Coord(coord.r - 1, coord.c + 1, coord.p + 1));
                    visit[coord.r - 1][coord.c + 1] = true;
                }
            }

            if (coord.c - 1 > 0 && !visit[coord.r][coord.c - 1] && grid[coord.r][coord.c - 1] == 0) {
                queue.offer(new Coord(coord.r, coord.c - 1, coord.p + 1));
                visit[coord.r][coord.c - 1] = true;
            }
            if (coord.c + 1 < grid[0].length && !visit[coord.r][coord.c + 1] && grid[coord.r][coord.c + 1] == 0) {
                queue.offer(new Coord(coord.r, coord.c + 1, coord.p + 1));
                visit[coord.r][coord.c + 1] = true;
            }

            if (coord.r + 1 < grid.length) {
                if (coord.c - 1 > 0 && !visit[coord.r + 1][coord.c - 1] && grid[coord.r + 1][coord.c - 1] == 0) {
                    queue.offer(new Coord(coord.r + 1, coord.c - 1, coord.p + 1));
                    visit[coord.r + 1][coord.c - 1] = true;
                }
                if (!visit[coord.r + 1][coord.c] && grid[coord.r + 1][coord.c] == 0) {
                    queue.offer(new Coord(coord.r + 1, coord.c, coord.p + 1));
                    visit[coord.r + 1][coord.c] = true;
                }
                if (coord.c + 1 < grid[0].length && !visit[coord.r + 1][coord.c + 1] && grid[coord.r + 1][coord.c + 1] == 0) {
                    queue.offer(new Coord(coord.r + 1, coord.c + 1, coord.p + 1));
                    visit[coord.r + 1][coord.c + 1] = true;
                }
            }
        }

        return -1;
    }

    private static class Coord {
        public int r, c, p;

        Coord(int r, int c, int p) {
            this.r = r;
            this.c = c;
            this.p = p;
        }
    }

    public static void main(String[] args) {
        System.out.println(new P1091ShortesPathInBinaryMatrix().shortestPathBinaryMatrix(
                new int[][]{{0, 1, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 0, 1, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}}
        ));
    }

}
