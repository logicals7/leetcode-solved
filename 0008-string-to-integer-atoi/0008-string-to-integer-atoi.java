class Solution {
    public int myAtoi(String s) {
        //cutting the leading spaces
        s = s.trim();

        //check if the string is empty
        if(s.equals("")) return 0;

        //storing the sign
        int sign = 1;
        int i = 0;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+') i++;

        //if there are no digits after optional sign return 0
        if(i == s.length() || !Character.isDigit(s.charAt(i))) return 0;

        //use recursion for the string after the sign if exists valid string
        return recursiveAtoi(s, i, sign, 0);
    }

    //below is the recursive function
    private int recursiveAtoi(String s, int i, int sign, int res){
        //base case: if there are no digits after optional sign return 0
        if(i == s.length() || !Character.isDigit(s.charAt(i))) return res*sign;

        //get the digit
        int digit = s.charAt(i) - '0';

        //check if adding this digit causes overflow
        //if it makes an overflow => then check if sign is 1 the return max_val  else min_val
        long overflowVal = (long)res * 10 + digit;
        if(overflowVal > Integer.MAX_VALUE) return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        //update the result if not an overflow;
        res = res * 10 + digit;
        //make the recursive call for next char
        return recursiveAtoi(s, i+1, sign, res);
    }
}


/*
class Solution {
    public int myAtoi(String s) {
        // Check if the input string is null
        if (s == null) return 0;

        // Step 1: Trim leading and trailing whitespace
        s = s.trim();

        // If the trimmed string is empty, return 0
        if (s.length() == 0) return 0;

        // Step 2: Initialize the sign and start index
        int sign = 1;
        int i = 0;
        
        // Check for the sign at the beginning of the string
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Step 3: Convert the digits to an integer
        long ans = 0;
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
        
        while (i < s.length()) {
            char ch = s.charAt(i);
            // Break if the current character is not a digit
            if (!Character.isDigit(ch)) break;

            // Convert the character to a digit and add it to ans
            ans = ans * 10 + (ch - '0');

            // Check for overflow conditions
            if (sign == 1 && ans > MAX) return MAX;
            if (sign == -1 && -ans < MIN) return MIN;
            
            i++;
        }
        
        // Return the final result with the correct sign
        return (int) (sign * ans);
    }
}
*/
