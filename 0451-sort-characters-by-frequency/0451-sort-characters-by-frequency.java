class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        //putting all the occurence of character in a hashmap
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }

        List<Character> ls = new ArrayList(mpp.keySet());
        ls.sort( (ob1, ob2) -> mpp.get(ob2) - mpp.get(ob1) );

        StringBuilder result = new StringBuilder();
        for(char c : ls){
            for(int i = 0; i < mpp.get(c); i++){
                result.append(c);
            }
        }
        return result.toString();
    }
}