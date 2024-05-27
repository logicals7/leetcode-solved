class Solution {
    public int beautySum(String s) {

        int totalBeauty = 0;

        for(int j = 0; j < s.length(); j++){
            HashMap<Character, Integer> mpp = new HashMap<>();
            for(int i = j; i < s.length(); i++){
                char ch = s.charAt(i);
                mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);

                int highest = 0;
                int lowest = Integer.MAX_VALUE;

                for(char c : mpp.keySet()){
                    if(mpp.get(c) > highest) highest = mpp.get(c);
                    if(mpp.get(c) < lowest) lowest = mpp.get(c);
                }
                totalBeauty += (highest - lowest);
            }
        }
        return totalBeauty;
    }
}