// Last updated: 7/10/2026, 3:19:39 PM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int n = nums.length;
4        int res[] = new int[n];
5        int c = 0;
6        int b = 1;
7        for (int i=0; i<n; i++){
8            if (nums[i]%2 == 0){
9                res[c] = nums[i];
10                c+=2;
11            }
12        }
13        for (int i=0; i<n; i++){
14            if (nums[i]%2 != 0){
15                res[b] = nums[i];
16                b+=2;
17            }
18        }
19        return res;
20    }
21}