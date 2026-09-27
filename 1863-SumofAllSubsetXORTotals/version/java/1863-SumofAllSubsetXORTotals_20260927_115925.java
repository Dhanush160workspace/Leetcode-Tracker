// Last updated: 9/27/2026, 11:59:25 AM
1class Solution {
2    public int subsetXORSum(int[] nums) {
3        return backtrack(0, 0, nums);
4    }
5    public int backtrack(int index, int currentXor, int[] nums){
6        if (index == nums.length){
7            return currentXor;
8        }
9        int include = backtrack(index+1, currentXor ^ nums[index], nums);
10        int exclude = backtrack(index+1, currentXor, nums);
11        return include + exclude;
12    }
13}