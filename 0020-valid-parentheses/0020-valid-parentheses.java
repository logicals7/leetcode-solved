class Solution {
    public boolean isValid(String s) {
        if(s.equals("")) return true;

        Stack<Character> st = new Stack<>(); 

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else{
                // If stack is empty, it means there is no opening bracket for the closing one
                //and it is given that s.length() is min 1.
                if(st.isEmpty()) return false;
                char top = st.peek();
                if( (top == '(' && c == ')')    ||
                    (top == '{' && c == '}')    ||
                    (top == '[' && c == ']') )  st.pop();
                else return false;
            }
        }

        
        return st.isEmpty();

        
    }
}