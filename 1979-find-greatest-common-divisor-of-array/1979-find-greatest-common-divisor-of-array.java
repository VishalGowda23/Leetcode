class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return (gcd(nums[0],nums[nums.length - 1]));
    }
    private int gcd(int n1 , int n2){
        while (n1 != n2 ){
            if(n1 > n2){
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
        }
        return n1;
    }
}