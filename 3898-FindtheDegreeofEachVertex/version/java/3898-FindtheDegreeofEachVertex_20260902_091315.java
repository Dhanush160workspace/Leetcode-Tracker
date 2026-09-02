// Last updated: 9/2/2026, 9:13:15 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int ans[] = new int[matrix.length];
4        int index = 0;
5        for (int i=0; i<matrix.length; i++){
6            int sum = 0;
7            for (int j=0; j<matrix[0].length; j++){
8                sum += matrix[i][j];
9            }
10            ans[index] = sum;
11            index++;
12        }
13        return ans;
14    }
15}