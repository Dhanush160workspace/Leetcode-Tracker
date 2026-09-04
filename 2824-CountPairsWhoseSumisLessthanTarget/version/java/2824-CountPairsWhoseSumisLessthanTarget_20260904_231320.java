// Last updated: 9/4/2026, 11:13:20 PM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int pc = 0;
4        int n = nums.size();
5        for (int i=0; i<n; i++){
6            for (int j=i+1; j<n; j++){
7                if ((nums.get(i) + nums.get(j)) < target){
8                    pc++;
9                }
10            }
11        }
12        return pc;
13    }
14}