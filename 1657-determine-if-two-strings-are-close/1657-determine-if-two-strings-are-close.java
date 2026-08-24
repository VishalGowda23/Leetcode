class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer>map1 = new HashMap<>(); 
        HashMap<Character, Integer>map2 = new HashMap<>(); 
        if(word1.length() != word2.length()){
            return false;
        }

        // for(char ch : word1.toCharArray()){
        //     map1.put(ch , map1.getOrDefault(ch,0)+1);
        // }
        // for(char ch : word2.toCharArray()){
        //     map2.put(ch , map2.getOrDefault(ch,0)+1);
        // }

        // if(!map1.keySet().equals(map2.keySet())){
        //     return false;
        // }

        // ArrayList<Integer> freq1 = new ArrayList<>(map1.values());
        // ArrayList<Integer> freq2 = new ArrayList<>(map2.values());

        // Collections.sort(freq1);
        // Collections.sort(freq2);

        // return freq1.equals(freq2);


        int [] count1 = new int[26];
        int [] count2 = new int[26];
        

        for(char c : word1.toCharArray()){
            count1[c - 'a']++;
        }
        for(char c : word2.toCharArray()){
            count2[c - 'a']++;
        }

        for(int i = 0 ; i < 26 ; i++ ){
            if(count1[i]== 0 && count2[i]!=0 || count1[i]!=0 && count2[i]==0){
                return false;
            }
        }

        Arrays.sort(count1);
        Arrays.sort(count2);

        return Arrays.equals(count1,count2);
    }
}