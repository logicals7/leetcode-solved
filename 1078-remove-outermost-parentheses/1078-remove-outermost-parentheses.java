class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String ans = "";

        //          ( ( ) ( ) ) ( ( ) )
        //count =   1 2 1 2 1 0 1 2 1 0
        //when count is 1, there is new segment, means new outer bracket
        //

        for(int i = 0; i < s.length(); i++){
            if((count != 1 && s.charAt(i) != '(') || count != 0 && s.charAt(i) != ')'){
                ans += s.charAt(i);
            }
            
            if(s.charAt(i) == '('){
                count++;
            }

            if(s.charAt(i) == ')'){
                count--;
            }
        }
        return ans;
        
    }
}