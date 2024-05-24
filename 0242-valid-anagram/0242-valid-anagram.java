class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            // char c1 = s.charAt(i); // Get character from s at index i
            // int index1 = c1 - 'a'; // Calculate index in charCount array
            // charCount[index1]++;    // Increment count at calculated index
            //or we could write above lines as:
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int i = 0 ; i < arr.length; i++)
            if(arr[i] != 0) return false;

        return true;
        
    }
}



/*
//method-1: using nlogn sorting
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
        
    }
}
*/