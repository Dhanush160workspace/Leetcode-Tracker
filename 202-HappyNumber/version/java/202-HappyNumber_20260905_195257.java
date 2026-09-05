// Last updated: 9/5/2026, 7:52:57 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        Arrays.sort(nums);
4
5        if(nums[0] != 0) {
6            return 0;
7        }
8
9        int ele = nums[0];
10
11        for(int i = 1; i < nums.length; i++) {
12            int next = ele + 1;
13
14            if(nums[i] != next) {
15                return next;
16            }
17
18            ele = nums[i];
19        }
20
21        return nums.length;
22    }
23}