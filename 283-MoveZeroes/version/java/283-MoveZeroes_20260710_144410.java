// Last updated: 7/10/2026, 2:44:10 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int curr = 0;
4        int n = nums.length;
5        for (int i=0; i<n; i++){
6            if (nums[i] != 0){
7                nums[curr] = nums[i];
8                curr++;
9            }
10        }
11        for (int i=curr; i<n; i++){
12            nums[i] = 0;
13        }
14    }
15}