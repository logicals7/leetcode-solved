class Solution {

    private long mod = 1_000_000_007; //or 10^9 + 7 = 1000_000_007

    public long pow(long x, long n){
        if(n==0) return 1;
        long smallAns = pow(x, n/2) % mod;
        if(n % 2 == 0) return (smallAns * smallAns) % mod;
        else return (smallAns * smallAns * x) % mod;
    }

    public int countGoodNumbers(long n) {
        //number of even & odd digits if number of digits are 5 will be 3 & 2 respectively
        long numOfEvenDigits = (n+1)/2;
        long numOfOddDigits = n/2;

        //since on even indices > even digit can be placed > so the choices are: 0, 2, 4, 6, 8
        //on odd indices > prime digit can be placed > so the choices are: 2, 3, 5, 7
        long evenChoices = 5;
        long oddChoices = 4;
        //our ans will be: total number of choices or permutations
        long first = pow(evenChoices, numOfEvenDigits) % mod;
        long sec = pow(oddChoices, numOfOddDigits) % mod;
        return (int)((first * sec) % mod);
    }
}