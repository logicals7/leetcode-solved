class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }


        HashMap<Character, Character> sTot = new HashMap<>();
        HashMap<Character, Character> tTos = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char a = s.charAt(i);
            char b = t.charAt(i);

            //if the Hashmap stoT contains the key already
            if(sTot.containsKey(a)){
                //then it should match the current char in t string
                if(sTot.get(a) != b) return false;
            }
            //if the Hashmap sTot does not contain the key
            else sTot.put(a, b);

            //if the HashMap tTos contains the key already
            if(tTos.containsKey(b)){
                //then it should match the current char in s string
                if(tTos.get(b) != a) return false;
            }
            //if the HashMap tTos does not contain the key
            else tTos.put(b, a);
        }
        return true;        
    }
}