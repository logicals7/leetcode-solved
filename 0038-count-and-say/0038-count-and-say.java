class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        
        String smallAns = countAndSay(n-1);
        
        int count = 1;
        StringBuilder res = new StringBuilder();
        
        //run till second last char
        for(int i = 0; i <= smallAns.length()-2; i++){
            char curr = smallAns.charAt(i);
            char next = smallAns.charAt(i+1);
            
            if(curr == next){
                count++;
            }
            else{
                res.append(count).append(curr);
                count = 1; //reset the count
            }
        }
        
        //append the last char to the res
        res.append(count).append(smallAns.charAt(smallAns.length()-1));
        return res.toString();
    }
}