class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        
        int left = 0, right = 0;
        
        while(right < nums.length-1){
            int farthest = 0;
            //calculating farthest we can reach from the curr index
            for(int i = left; i <= right; i++){
                farthest = Math.max(farthest, i+nums[i]);
            }
            
            //update the left & right pointers
            left = right+1;
            right = farthest;
            //we have made a jump when we have our new left & right
            jump++;
            
        }
        return jump;
    }
}