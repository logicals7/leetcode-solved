class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        //if we remove the below line, then this code rotates the array to left.
        k=n-k;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public void reverse(int[] arr, int si, int ei){
        while(si <= ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
}