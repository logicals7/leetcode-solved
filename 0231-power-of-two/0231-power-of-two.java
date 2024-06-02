class Solution {
    
    /*
To determine if an integer \U0001d45b is a power of two, we can use a property of binary representation. A number is a power of two if it has exactly one bit set in its binary representation. For example, 1 (0001), 2 (0010), 4 (0100), 8 (1000) all have exactly one bit set.
    
A bitwise trick to check if n is a power of two is to use the fact that a power of two minus one flips all the bits of the original number. For example:
    4=0100 in binary and 4−1=3=0011
    8=1000 in binary and 8−1=7=0111
    Hence n & n-1 operation will give us zero.
    
Check if \U0001d45b is positive: n should be greater than 0 because negative numbers and zero cannot be powers of two.

TC = O(1)
    
    */
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n-1)) == 0;    
    }
}