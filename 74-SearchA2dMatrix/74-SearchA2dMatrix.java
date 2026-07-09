// Last updated: 7/9/2026, 3:10:59 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for (int i=0; i<matrix.length; i++){
        //     for (int j=0; j<matrix[0].length; j++){
        //         if (target == matrix[i][j]) return true;
        //     }
        // }
        // return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = col-1;
        while (i<row && j>=0){
            if (matrix[i][j] == target){
                return true;
            } else if (target > matrix[i][j]){
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}