// Last updated: 7/9/2026, 3:07:49 PM
class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        String a = new StringBuilder(s).reverse().toString();
        int dp[][] = new int[n+1][n+1];
        for (int num[]:dp){
            Arrays.fill(num, -1);
        }
        int ans = helper(s, a, n, n, dp);
        return (n - ans);
    }
    public int helper(String s, String a, int n, int m, int dp[][]){
        if (n==0 || m==0) return 0;
        if (dp[n][m] != -1) return dp[n][m];
        if (s.charAt(n-1) == a.charAt(m-1)){
            int ans = 1 + helper(s, a, n-1, m-1, dp);
            dp[n][m] = ans;
            return ans;
        }
        int left = helper(s, a, n-1, m, dp);
        int right = helper(s, a, n, m-1, dp);
        dp[n][m] = Math.max(left, right);
        return dp[n][m];
    }
}