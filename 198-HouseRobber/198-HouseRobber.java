// Last updated: 7/9/2026, 3:10:06 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length-1;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(nums, n, dp);
    }
    public int helper(int nums[], int n, int dp[]){
        if (n<0){
            return 0;
        }
        if (dp[n] != -1){
            return dp[n];
        }
        int take = nums[n] + helper(nums, n-2, dp);
        int notTake = helper(nums, n-1, dp);
        dp[n] = Math.max(take, notTake);
        return dp[n];
    }
}