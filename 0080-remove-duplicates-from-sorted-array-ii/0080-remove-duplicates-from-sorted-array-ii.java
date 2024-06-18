class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==1) return 1;
        
        int count = 1;
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count <= 2){
                    nums[insertIndex] = nums[i];
                    insertIndex++;
                }
            } 
            else{
                count = 1;
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;    
    }
}