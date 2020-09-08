package rhx.leetcode.to499.to99.to49;

public class P42TrappingRainWater {

    public int trap(int[] height) {
        int sum = 0, max = 0;
        int[][] map = new int[2][height.length];

        for (int i = 0; i < height.length; ++i) {
            max = Math.max(height[i], max);
            map[0][i] = max;
        }

        max = 0;
        for (int i = height.length - 1; i >= 0; --i) {
            max = Math.max(height[i], max);
            map[1][i] = max;
        }

        for (int i = 0; i < height.length; ++i) {
            if (map[0][i] > height[i] && map[1][i] > height[i])
                sum += Math.min(map[0][i], map[1][i]) - height[i];
        }

        return sum;
    }

}
