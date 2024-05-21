//Using binary search
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        if(nums[0] > nums[1]) return 0;
        else if(nums[n-1] > nums[n-2]) return n-1;

        int low = 1, high = n-2;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) return mid;
            else if(nums[mid] > nums[mid-1]) low = mid+1;
            else high = mid-1;
        }  
        return -1;      
    }
}


/*
//using linear search
class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;

        if(n==1) return 0;

        for(int i = 0; i < n; i++){
            //since the nums[-1] & nums[n] are -infinity.
            if(i == 0 && arr[i] > arr[i+1]){
                    return i;
            }
            else if(i == n-1 && arr[i] > arr[i-1]){
                return i;
            }

            if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                return i;
            }
            
        }
        return -1;
        
    }
}

*/