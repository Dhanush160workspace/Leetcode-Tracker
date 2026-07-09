// Last updated: 7/9/2026, 3:09:10 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n+1][m+1];
        for (int num[]:dp){
            Arrays.fill(num, -1);
        }
        int res = helper(word1, word2, n, m, dp);
        return ((n+m) - 2*res);
    }
    public int helper(String s1, String s2,int n1,int n2, int dp[][]){
        if (n1==0 || n2==0){
            return 0;
        }
        if (dp[n1][n2] != -1){
            return dp[n1][n2];
        }
        if (s1.charAt(n1-1) == s2.charAt(n2-1)){
            int ans = 1 + helper(s1, s2, n1-1, n2-1, dp);
            dp[n1][n2] = ans;
            return ans;
        }

        int left = helper(s1, s2, n1-1, n2, dp);
        int right = helper(s1, s2, n1, n2-1, dp);
        dp[n1][n2] = Math.max(left, right);
        return dp[n1][n2];
    }
}