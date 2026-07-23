class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        // for(int i = 0 ; i < nums.length ; i ++){
        //     int product = 1;
        //     for(int j = 0 ; j < nums.length ; j++){
        //         if(i == j){
        //             continue;
        //         }
        //         else{
        //             product *= nums[j];
        //         }
        //     }
        //     answer[i] = product;
        // }

        // left 
        answer[0] = 1 ;
        for(int i = 1 ; i <= nums.length-1  ; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        // right 
        int right = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            answer[i] = answer[i] * right;
            right *= nums[i];
        }


        return answer;
    }
}