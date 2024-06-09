class Solution {
    public int repeatedStringMatch(String a, String b) {
        int repeated = 1;
        StringBuilder repeatedA = new StringBuilder(a);
        
        //repeat String a until its len becomes atleast equal to b
        while(repeatedA.length() < b.length()){
            repeatedA.append(a);
            repeated++;
        }
        
        //check if String a contains b
        if(repeatedA.toString().contains(b)){
            return repeated;
        }
        
        //check if b is a substring of repeatedA with one more repetition of a
        repeatedA.append(a);
        if(repeatedA.toString().contains(b)){
            return repeated+1;
        }
        
        //if b is not found
        return -1;
        
        
    }
}