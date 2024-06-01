//reverse a string using stack
class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length; i++){
            st.push(s[i]);
        }

        for(int i = 0; i < s.length; i++){
            s[i] = st.pop();
        }


    }
}

/*
class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }       
    }
}
*/