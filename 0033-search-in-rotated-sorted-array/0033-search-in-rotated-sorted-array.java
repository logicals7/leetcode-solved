class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;

            //one of the half must be sorted if the array is rotated
            //if left half is sorted
            if(nums[low] <= nums[mid])
                //if element exists in left half it must be between low & mid
                if(nums[low] <= target && target <= nums[mid]) high = mid-1;
                //if not exists in this half
                else low = mid +1;
            
            //if the right half is sorted
            else
                //if element exists in right half it must be between low & mid
                if(nums[mid] <= target && target <= nums[high]) low = mid+1;
                //if not exists in this half
                else high = mid-1;
        }
        return -1;
        
    }
}