class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder resultS = new StringBuilder();
        char[] j = s.toCharArray();
        for(int i =0 ; i < j.length ; i++){
            if(j[i] == '#'){
                if(resultS.length() > 0){

                resultS.deleteCharAt(resultS.length() - 1);
                }
            }
            else{
                resultS.append(j[i]);
            }
        }
        StringBuilder resultT = new StringBuilder();
        char[] k = t.toCharArray();
        for(int i =0 ; i < k.length ; i++){
            if(k[i] == '#'){
                if(resultT.length() > 0){

                resultT.deleteCharAt(resultT.length() - 1);
                }
            }
            else{
                resultT.append(k[i]);
            }
        }
        return resultS.toString().equals(resultT.toString());
    }
}