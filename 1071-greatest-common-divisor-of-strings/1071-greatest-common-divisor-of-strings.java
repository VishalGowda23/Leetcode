class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals((str2+str1))){
            return "";
        }
        else{
        return str1.substring(0,gcd(str1.length(),str2.length()));
        }
    }
        private int gcd(int n1 , int n2){
            while(n1 != n2){
                if(n1>n2){
                    n1 = n1 - n2;
                }
                else{
                    n2 = n2 - n1;
                }
            }
            return n1 ;
        }
}