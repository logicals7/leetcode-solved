class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        mpp.put('I', 1);
        mpp.put('V', 5);
        mpp.put('X', 10);
        mpp.put('L', 50);
        mpp.put('C', 100);
        mpp.put('D', 500);
        mpp.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length(); i++){
            int currVal = mpp.get(s.charAt(i));

            if(i < s.length()-1){
                int nextVal = mpp.get(s.charAt(i+1));
                if(currVal < nextVal) total = total - currVal;
                else total = total + currVal;
            }
            else total += currVal;
        }
        return total;        
    }
}