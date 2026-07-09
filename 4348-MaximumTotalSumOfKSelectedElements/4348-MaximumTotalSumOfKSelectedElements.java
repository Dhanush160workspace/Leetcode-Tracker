// Last updated: 7/9/2026, 3:05:34 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n = nums.length;
        Arrays.sort(nums);
        long totalSum = 0;
        int m = mul;
        for (int i = n-1; i>=n-k; i--){
            long c1 = (long) nums[i];
            long c2 = (long) nums[i]*m;
            totalSum += Math.max(c1, c2);
            m--;
        }
        return totalSum;
    }
}