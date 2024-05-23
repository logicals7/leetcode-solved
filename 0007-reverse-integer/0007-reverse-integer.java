class Solution {
    public int reverse(int n) {

        boolean isNeg = n < 0;
        if(n < 0){
            n = -n;
        }

        long revNum = 0;
        while(n > 0){
            revNum = revNum * 10 + n % 10;
            n = n/10;
        }

        //if the revNum is greater than the Integer limit
        if (revNum > Integer.MAX_VALUE) {
            return 0;
        }

        return isNeg ? (int)-revNum : (int)revNum;
    }
}