// Last updated: 7/9/2026, 3:09:57 PM


class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int arr1[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
        }
        
        int arr2[] = new int[n - 1];
        int j = 0;
        for (int i = 1; i < n; i++) {
            arr2[j] = nums[i];
            j++;
        }
        
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int ans1 = helper(arr1, arr1.length - 1, dp);
        
        Arrays.fill(dp, -1);
        int ans2 = helper(arr2, arr2.length - 1, dp);
        
        return Math.max(ans1, ans2);
    }
    
    public int helper(int arr[], int a, int dp[]) {
        if (a < 0) {
            return 0;
        }
        if (a == 0) {
            return arr[0];
        }
        if (dp[a] != -1) {
            return dp[a];
        }
        
        dp[a] = Math.max(helper(arr, a - 1, dp), arr[a] + helper(arr, a - 2, dp));
        return dp[a];
    }
}