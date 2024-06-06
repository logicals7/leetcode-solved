class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, "", 0, 0, n);
        return ans;  
    }
    
    public void solve(List<String> ans, String currStr, int open, int close, int n){
        //base case: return if all pairs are used
        if(currStr.length() == n*2){
            ans.add(currStr);
            return;
        }
        
        if(open < n){
            solve(ans, currStr + "(", open+1,  close, n);
        }
        if(close < open){
            solve(ans, currStr + ")", open, close+1, n);
        }           
        
    }
}