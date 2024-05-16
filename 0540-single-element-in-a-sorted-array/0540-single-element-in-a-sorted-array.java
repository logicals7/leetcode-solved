class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length-1;

        //edge cases:
        //if there is only one element in array
        if(arr.length == 1) return arr[0];
        //if the first element is single
        if(arr[0] != arr[1]) return arr[0];
        //if the last element is single
        if(arr[n] != arr[n-1]) return arr[n];

        //since we have already checked for our first & last index update low & high as below;
        int low = 1, high = n-2;

        while(low <= high){
            int mid = (low+high)/2;

            //if arr[mid] is the single eleme
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            //suppose the arr is: 1 1 2 3 3 4 4 8 8.
            //here mid = 4th index
            //0 1 2 3   4   5 6 7 8
            //e o e o   e   o e o e
            //1 1 2 3   3   4 4 8 8

            //if the element is on the right half: the left order must be (even, odd) = 5, 5
            //if the element is on the left half: the right order must be (odd, even)

            //if element is on the right half, the left order must be (even,odd)
            //if we are standing on the mid(odd) index, the same element must be on the mid-1
            //and if we are standing on the mid(even), the same element must be on the mid+1
            if((mid%2 == 1 && arr[mid] == arr[mid-1]) || (mid%2==0 && arr[mid] == arr[mid+1])){
                //if element is on the right half, eliminating the left half
                low = mid+1;
            }
            else{
                //if element is on the right half, eliminating the right half
                high = mid-1;
            }
        }
        return -1;
    }
}