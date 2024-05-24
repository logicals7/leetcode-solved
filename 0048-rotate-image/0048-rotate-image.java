class Solution {
    //in transpose matrix all rows becomes cols
        // 1  2  3  4   becomes 1  5  9  13    => (1,0) (0,1)  
        // 5  6  7  8           2  6 10  14    => (2,0) (0,2)   (2,1) (1,2)
        // 9 10 11 12           3  7 11  15    => (3,0) (0,3)   (3,1) (1,3)    (3,2) (2,3)
        //13 14 15 16           4  8 12  16
        //=> all the diagonal elements remains same

    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        int n = matrix.length;
        //reverse each row of matrix to get the roatation using two pointer approach
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            // Reverse the elements in the current row
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        
    }
}

/*
//Approach-1: Brute Force: TC=O(n*n),  SC=O(n*n)
class Solution {
    public void rotate(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int ans[][] = new int[m][n];

        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                ans[j][n-1-i] = matrix[i][j];
            }
        }

        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = ans[i][j];
            }
        }
        
    }
}
*/