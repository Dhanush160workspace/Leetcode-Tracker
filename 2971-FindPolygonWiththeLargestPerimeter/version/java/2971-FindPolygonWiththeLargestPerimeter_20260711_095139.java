// Last updated: 7/11/2026, 9:51:39 AM
1class Solution {
2    public long largestPerimeter(int[] nums) {
3        Arrays.sort(nums);
4        long sum = 0;
5        for (int num:nums){
6            sum += num;
7        }
8        for (int i=nums.length-1; i>0; i--){
9            sum = sum - nums[i];
10            if (sum > nums[i]){
11                return sum + nums[i];
12            }
13        }
14        return -1;
15    }
16}