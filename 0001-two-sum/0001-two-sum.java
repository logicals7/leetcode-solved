class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int moreNeeded = target - nums[i]; //we need to complete the target, so look for a req number in the hashmap
            if(mpp.containsKey(moreNeeded)){
                return new int[] {mpp.get(moreNeeded), i};
            }
            mpp.put(nums[i], i);
        }
        return new int[]{};
        
    }
}