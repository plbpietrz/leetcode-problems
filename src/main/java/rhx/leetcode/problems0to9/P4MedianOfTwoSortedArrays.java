package rhx.leetcode.problems0to9;

public class P4MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1.length > nums2.length ? nums1 : nums2;
        int[] B = nums1.length > nums2.length ? nums2 : nums1;

        if (A.length == 0 && B.length == 0) return -1;
        if (A.length == 0) {
            if (B.length % 2 == 0)
                return (B[B.length / 2] + B[B.length / 2 - 1]) / 2.d;
            else
                return B[B.length / 2];
        }
        if (B.length == 0) {
            if (A.length % 2 == 0)
                return (A[A.length / 2] + A[A.length / 2 - 1]) / 2.d;
            else
                return A[A.length / 2];
        }

        int l = 0;
        int r = A.length;

        while (l <= r) {
            int i = (l + r) / 2;
            int j = (A.length + B.length + 1) / 2 - i;

            int maxLA = (i > 0 ? A[i - 1] : Integer.MIN_VALUE);
            int minRA = (i < A.length ? A[i] : Integer.MAX_VALUE);

            int maxLB = (j > 0 ? B[j - 1] : Integer.MIN_VALUE);
            int minRB = (j < B.length ? B[j] : Integer.MAX_VALUE);

            if (maxLA <= minRB && maxLB <= minRA) {
                if ((A.length + B.length) % 2 == 0)
                    return (Math.max(maxLA, maxLB) + Math.min(minRA, minRB)) / 2.d;
                else
                    return Math.max(maxLA, maxLB);
            } else if (maxLA > minRB) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }

        return -1;
    }

}
