class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        int num = 0;
        String current = "";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            }
            else if(c == '['){
                numStack.push(num);
                strStack.push(current);

                num = 0 ;
                current = "";
            }
            else if(c == ']'){
                int repeat = numStack.pop();
                String previous = strStack.pop();

                for(int i = 0 ; i < repeat ; i++){
                    previous += current;
                }
                current = previous;
            }
            else{
                current += c;
            }
        }
        return current;
    }
}