class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;

            //the below if block is not mandatory for the ans, yet it optimize the code 
            //if search space is already sorted then arr[low] will always be the minimum 
            if (nums[low] <= nums[high]) {
                min = Math.min(min, nums[low]);
                break;
            }

            if(min > nums[mid]) min = nums[mid];
            //if arr is rotated one of the halves must be sorted
            //if left half is sorted
            if(nums[low] <= nums[mid]){
                min = Math.min(min, nums[low]);
                low = mid+1;
            }
            //if right half is sorted
            else{
                min = Math.min(min, nums[mid]);
                high = mid-1;
            }
        }
        return min;
        
    }
}