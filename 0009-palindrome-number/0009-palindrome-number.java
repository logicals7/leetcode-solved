class Solution {
    public boolean isPalindrome(int x) {
        int revNum = 0;
        int n = x;
        if(n < 0){ return false;}

        while(n > 0){
            int lastDigit = n%10;
            revNum = revNum*10 + lastDigit;
            n = n/10;
        }
        if( x == revNum){
            return true;
        }
        return false;  
    }
}