class Solution {
    public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] <= smallest){
                smallest = nums[i];
            }
            else if( (nums[i] > smallest) && (nums[i] <= secondSmallest) ){
                secondSmallest = nums[i];
            }
            else if(nums[i] > secondSmallest){
                return true;
            }
        }
        return false;
    }
}