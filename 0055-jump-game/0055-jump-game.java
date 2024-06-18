//approach: we start from the end index & if we can reach the end from end-1, 
//then our new target is to reach the end-1
class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for(int i = goal-1; i >= 0; i--){
            //if i+nums[i] > greater than goal, that means we can reach the goal from current index,
            //so we will check that if we can reach the curr index from curr-1 index, so goal is curr index
            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        return (goal==0?true:false);
    }
}

/*
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
*/