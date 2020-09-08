package rhx.leetcode.to1499.to1099.to1099;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P1091ShortesPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;

        int[][] pt = new int[R][C]; pt[0][0] = 1;
        boolean[][] v = new boolean[R][C];

        if (grid[0][0] != 0) {
            return -1;
        }

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            v[p.r][p.c] = true;
            for (Point n : p.neighbors(grid, v)) {
                queue.offer(n);
                if ((pt[p.r][p.c] + 1 < pt[n.r][n.c]) || pt[n.r][n.c] == 0)
                    pt[n.r][n.c] = pt[p.r][p.c] + 1;
            }
        }
        return pt[R - 1][C - 1] == 0 ? -1 : pt[R - 1][C - 1];
    }

    private static class Point {
        private static int[][] NEIGHBOURS = {
                {-1, -1}, {-1, 0}, {-1, 1},
                { 0, -1},          { 0, 1},
                { 1, -1}, { 1, 0}, { 1, 1}
        };

        public int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }

        public List<Point> neighbors(int[][] grid, boolean[][] visit) {
            List<Point> result = new ArrayList<>();
            for (int[] n : NEIGHBOURS) {
                int r = this.r + n[0];
                int c = this.c + n[1];
                if (isValid(r, c, grid, visit))
                    result.add(new Point(r, c));
            }
            return result;
        }

        private boolean isValid(int r, int c, int[][] grid, boolean[][] visit) {
            int R = grid.length;
            int C = grid[0].length;
            return r > -1 &&
                    r < R &&
                    c > -1 &&
                    c < C &&
                    visit[r][c] == false &&
                    grid[r][c] != 1;
        }

        @Override
        public String toString() {
            return String.format("(%s, %d)", r, c);
        }
    }

    public int shortestPathBinaryMatrix2(int[][] grid) {
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
