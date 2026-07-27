class Solution {
    public int maxProduct(int[] nums) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > highest){
                secondHighest = highest;
                highest = nums[i];
            }
            else if(nums[i] > secondHighest){
                secondHighest = nums[i];
            }
        }
        return (highest-1) * (secondHighest-1);
    }
}