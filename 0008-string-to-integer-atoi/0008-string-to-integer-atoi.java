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
