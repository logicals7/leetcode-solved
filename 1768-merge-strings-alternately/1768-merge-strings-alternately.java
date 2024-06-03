class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i = 0;
        int j = 0;
        int k = 0;
        char word1[] = w1.toCharArray();
        char word2[] = w2.toCharArray();
        char str[] = new char[word1.length+word2.length];
        
        while(i < word1.length && j < word2.length){
            if(k%2 == 0){
                str[k] = word1[i];
                i++;
            }
            else{
                str[k] = word2[j];  
                j++;
            }
            k++;
        }
        
        while(i < word1.length){
            str[k] = word1[i];
            i++;
            k++;
        }
        while(j < word2.length){
            str[k] = word2[j];
            j++;
            k++;
        }
        
        // In your current code, you're converting the char array to a String using
        // Arrays.toString(). However, Arrays.toString() returns a string representation 
        // of the array in a format like "[a, b, c]", which is not what you want. 
        // Instead, you should use the new String(char[] value) constructor to create a 
        //String from the char array.
        
        //return Arrays.toString(str);
        return new String(str);
    }
}