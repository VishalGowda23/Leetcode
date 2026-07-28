class Solution {
    public char findTheDifference(String s, String t) {
        // int[] freq = new int[26];

        // for(char c : s.toCharArray()){
        //     freq[c-'a']++;
        // }
        // for(char c:t.toCharArray()){
        //     freq[c-'a']--;

        //     if(freq[c-'a'] < 0){
        //         return c;
        //     }
        // }
        // return ' ';

        char ans = 0;

        for(char c : s.toCharArray()){
            ans ^= c;
        }
        for(char c : t.toCharArray()){
            ans ^= c;
        }
        return ans;
    }
}