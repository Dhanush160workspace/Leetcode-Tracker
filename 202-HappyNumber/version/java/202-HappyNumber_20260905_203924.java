// Last updated: 9/5/2026, 8:39:24 PM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int n = nums.length;
4        int ans[] = new int[n];
5        for (int i=0; i<n; i++){
6            int num = nums[i];
7            int c = 0;
8            for (int j=0; j<n; j++){
9                if (nums[j] < num){
10                    c++;
11                }
12            }
13            ans[i] = c;
14        }
15        return ans;
16    }
17}