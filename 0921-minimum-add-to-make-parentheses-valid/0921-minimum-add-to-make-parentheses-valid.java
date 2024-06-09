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