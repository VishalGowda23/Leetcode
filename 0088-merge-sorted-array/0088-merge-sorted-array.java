class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int nP1 = m - 1;             
        int nP2 = n - 1;             
        int write = m + n - 1;       

        while (nP2 >= 0) {
            if (nP1 >= 0 && nums1[nP1] > nums2[nP2]) {
                nums1[write] = nums1[nP1];
                nP1--;
            } else {
                nums1[write] = nums2[nP2];
                nP2--;
            }
            write--;
        }
    }
}