// Last updated: 9/5/2026, 7:55:35 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        Arrays.sort(nums);
4        if(nums[0] != 0) {
5            return 0;
6        }
7        int ele = nums[0];
8        for (int i=1; i<nums.length; i++){
9            int next = ele+1;
10            if (nums[i] != next){
11                return next;
12            }
13            ele = nums[i];
14        }
15        return nums.length;
16    }
17}