class Solution {
    public int trap(int[] height) {

        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];

        int count = 0;
        int lm = height[0];

        for (int i = 0; i < height.length; i++) {

            if (height[i] > lm) {
                lm = height[i];
            }

            lmax[i] = lm;
        }

        int rm = height[height.length - 1];

        for (int i = height.length - 1; i >= 0; i--) {

            if (height[i] > rm) {
                rm = height[i];
            }

            rmax[i] = rm;
        }

        for (int i = 0; i < height.length; i++) {

            int water = Math.min(lmax[i], rmax[i]) - height[i];

            count = count + water;
        }

        return count;
    }
}