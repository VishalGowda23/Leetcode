class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < nums1.length ; i++){
            boolean found = false;
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    found = true;
                }
            }
            if(!found  && !ans1.contains(nums1[i]) ){
                ans1.add(nums1[i]);
            }
        }
        for(int i = 0 ; i < nums2.length ; i++){
            boolean found = false;
            for(int j = 0 ; j < nums1.length ; j++){
                if(nums2[i] == nums1[j]){
                    found = true;
                }
            }
            if(!found  && !ans2.contains(nums2[i]) ){
                ans2.add(nums2[i]);
            }
        }
        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }
}