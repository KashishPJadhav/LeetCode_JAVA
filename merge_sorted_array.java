class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers
        int i = m - 1;  // Pointer to the last element in nums1's valid portion
        int j = n - 1;  // Pointer to the last element in nums2
        int k = m + n - 1;  // Pointer to the last position in nums1 array
        
        // Merge nums1 and nums2 from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];  // Place the larger element in nums1
            } else {
                nums1[k--] = nums2[j--];  // Place the larger element in nums2
            }
        }
        
        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
