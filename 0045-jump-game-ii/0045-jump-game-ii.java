class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int lastJump = 0; // Current boundary of the segment we are considering
        int coverage = 0;   // coverage index we can reach with the current number of jumps

        for (int i = 0; i < nums.length - 1; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastJump) {
                jumps++;
                lastJump = coverage;

                // If at any point, we can already reach or exceed the last index, return jumps
                if (lastJump >= nums.length - 1) {
                    return jumps;
                }
            }
        }

        return jumps;
    }
}



/*
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
*/