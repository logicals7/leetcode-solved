class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }
        
        for(int val: mpp.values()){
            if(val > 1){
                return true;
            }
        }
        return false;
    }
}