/**
LeetCode #4. Median of Two Sorted Arrays (HARD)

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        
        while (low <= high) {

            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX; 
            // total size of left partition minus left partition of X
            
            // If partitionX is 0, nothing is on the left side of nums1. Use -INF
            // If partitionX is m, nothing is on the right side of nums1. Use +INF

            int L1 = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1]; 
            int R1 = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            
            int L2 = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int R2 = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
            
            if (L1 <= R2 && L2 <= R1) {
                
                if ((m + n) % 2 == 1) { // total # elements odd
                    return Math.max(L1, L2);
                } 
                
                else { // total # elements even
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                }
            } 

            else if (L1 > R2) {
                high = partitionX - 1;
            } 

            else {
                low = partitionX + 1;
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted or invalid.");
    }
}

 */