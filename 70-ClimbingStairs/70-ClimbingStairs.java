// Last updated: 7/9/2026, 3:11:02 PM
class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
    public static int helper(int n, int dp[]){
        if (n== 2 || n==1){
            dp[n] = n;
            return n;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        dp[n] = helper(n-1, dp) + helper(n-2, dp);
        return dp[n];
    }
}