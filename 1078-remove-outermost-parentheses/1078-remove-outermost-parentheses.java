//using stack
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        int start = 0; // to mark the start of a primitive string

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') st.push(s.charAt(i));
            else st.pop();

            //if stack is empty, then we have one complete segment
            //remove its outermost parentheses & store in result
            if(st.isEmpty()){
                ans += s.substring(start+1, i);
                start = i+1;
            }
        }
        return ans;
        
    }
}




/*
//using brute force
class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String ans = "";

        //          ( ( ) ( ) ) ( ( ) )
        //count =   1 2 1 2 1 0 1 2 1 0
        //when count is 1, there is new segment, means new outer bracket
        //sequence of conditions written below in necessary

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

*/