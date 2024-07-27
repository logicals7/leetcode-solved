class Solution {
    public int lengthOfLongestSubstring(String s) {
        //stores the char and the last seen index of the char
        HashMap<Character, Integer> mpp = new HashMap<>();
        int l = 0, r = 0;
        int n = s.length();
        int maxLen = 0;
        
        while(r < n){
            char curr = s.charAt(r);
            if(mpp.containsKey(curr)){
                l = Math.max(mpp.get(curr) + 1, l); 
            }
            mpp.put(curr, r); //putting the key and its index in mpp
            maxLen = Math.max(r-l+1, maxLen);  
            r++;
        }
        return maxLen;
        
    }
        
}