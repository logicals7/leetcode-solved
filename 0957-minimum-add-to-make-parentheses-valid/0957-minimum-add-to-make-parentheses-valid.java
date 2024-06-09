class Solution {
    public int minAddToMakeValid(String s) {
        int countOpen = 0;
        int countClose = 0;
        for(char c : s.toCharArray()){
            if(c == '(') countOpen++;
            else if(c == ')' && countOpen > 0) countOpen--;
            else if(c == ')') countClose++;
        }
        return countOpen + countClose;
        
    }
}


/*
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int countCloseBracket = 0;
        int countStackElements = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(c);
            }
            else{
                if(st.isEmpty() && c == ')'){
                    countCloseBracket++;
                }
                else if(st.peek() == '(' && c == ')'){
                    st.pop();
                }
            }
        }
        
        while(!st.isEmpty()){
            countStackElements++;
            st.pop();
        }
        
        return countStackElements + countCloseBracket;
        
    }
}
*/