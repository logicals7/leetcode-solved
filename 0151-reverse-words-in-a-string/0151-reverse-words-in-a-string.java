class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        String ans = "";
        int ei = n; //ei of the word

        for(int i = n-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if (i + 1 < ei) ans = ans + s.substring(i+1, ei) + " ";
                ei = i;
            }
        }

        //adding first word
        ans = ans + s.substring(0, ei);
        return ans;
        
    }
}