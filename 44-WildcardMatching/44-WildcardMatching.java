// Last updated: 7/9/2026, 3:11:20 PM
class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        // dp[i][j] stores if s[0...i-1] matches p[0...j-1]
        boolean[][] dp = new boolean[n + 1][m + 1];
        
        // Base case: empty string matches empty pattern
        dp[0][0] = true;
        
        // Base case: empty string s with a pattern p containing only '*'
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If characters match or pattern has '?'
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } 
                // If pattern has '*'
                else if (p.charAt(j - 1) == '*') {
                    // Two choices: 
                    // 1. '*' matches 0 characters: dp[i][j-1]
                    // 2. '*' matches 1 or more characters: dp[i-1][j]
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } 
                // Characters do not match
                else {
                    dp[i][j] = false;
                }
            }
        }
        
        return dp[n][m];
    }
}