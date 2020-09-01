package rhx.leetcode.problems0to9;

public class P4MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            int[] tmp = nums1.length == 0 ? nums2 : nums1;
            return (tmp.length % 2 == 0)
                    ? (tmp[tmp.length / 2] + tmp[tmp.length / 2 - 1]) / 2.d
                    : (tmp[tmp.length / 2]);
        }

        int low = 0;
        int high = nums1.length;

        do {
            int med1 = (high + low) / 2;
            int med2 = (nums1.length + nums2.length + 1) / 2 - med1;

            int maxL1 = med1 > 0 ? nums1[med1-1] : Integer.MIN_VALUE;
            int minR1 = med1 < nums1.length ? nums1[med1] : Integer.MAX_VALUE;
            int maxL2 = med2 > 0 ? nums2[med2-1] : Integer.MIN_VALUE;
            int minR2 = med2 < nums2.length ? nums2[med2] : Integer.MAX_VALUE;

            if (maxL1 > minR2) {
                high = med1 - 1;
            } else if (minR1 < maxL2) {
                low = med1 + 1;
            } else {
                return (nums1.length + nums2.length) % 2 == 0
                        ? (Math.max(maxL1, maxL2) + Math.min(minR1, minR2)) / 2.d
                        : Math.max(maxL1, maxL2);
            }

        } while (low <= high);

        return -1;
    }

}
