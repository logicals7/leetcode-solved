class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str = str + Character.toLowerCase(c);
            } 
        }
        return isPalindromeHelper(str, 0, str.length()-1);
    }

    public boolean isPalindromeHelper(String str, int left, int right){
        //base case
        if(left >= right) return true;
        // Check if characters at left and right are equal
        if(str.charAt(left) != str.charAt(right)) return false;        
        // Recur for the substring excluding the checked characters
        return isPalindromeHelper(str, left + 1, right - 1);
    }
}