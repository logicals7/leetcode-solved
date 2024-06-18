class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for(int i = 0; i < nums.length; i++){

            // If at any point, the i reaches beyond the maxReach
            // means we are stuck at a particular index where it was 0
            if (i > maxReach) return false;

            //if at any index maxReach becomes greater than the nums.length
            //that mean we can reach the end
            if(maxReach > nums.length-1) return true;

            maxReach = Math.max(maxReach, i+nums[i]);
        }
        return true;
        
    }
}