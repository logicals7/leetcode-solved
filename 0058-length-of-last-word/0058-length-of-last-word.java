class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.equals("")) return 0;
        int lastSpace = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                lastSpace = i;
            }
        }
        
        if(lastSpace == 0) return s.length();
        
        int count = 0;        
        for(int i = lastSpace+1; i < s.length(); i++){
            count++;
        }
        return count;
    }
}