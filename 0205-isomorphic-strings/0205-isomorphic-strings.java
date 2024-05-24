class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sTot = new HashMap<>();
        HashMap<Character, Character> tTos = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (sTot.containsKey(a)) {
                if (sTot.get(a) != b) {
                    return false;
                }
            } else {
                sTot.put(a, b);
            }

            if (tTos.containsKey(b)) {
                if (tTos.get(b) != a) {
                    return false;
                }
            } else {
                tTos.put(b, a);
            }
        }
        
        return true;
    }
}
