// Last updated: 7/9/2026, 3:07:14 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int Max = 0;
        for (int i=0; i<accounts.length; i++){
            int sum = 0;
            for (int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if (sum > Max){
                Max = sum;
            }
        }
        return Max;
    }
}