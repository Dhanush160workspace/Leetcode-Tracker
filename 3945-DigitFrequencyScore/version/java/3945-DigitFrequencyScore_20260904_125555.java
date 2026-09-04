// Last updated: 9/4/2026, 12:55:55 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int[] res = new int[nums.length];
4        for (int i=0; i<nums.length; i++){
5            int index = i;
6            int ls = 0;
7            int rs = 0;
8            for (int a=0; a<i; a++){
9                ls+= nums[a];
10            }
11            for (int a=i+1; a<nums.length; a++){
12                rs+= nums[a];
13            }
14            if (ls < rs){
15                res[i] = (rs-ls);
16            } else {
17                res[i] = (ls-rs);
18            }
19        }
20        return res;
21    }
22}