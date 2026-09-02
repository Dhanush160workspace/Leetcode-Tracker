// Last updated: 9/2/2026, 9:34:52 AM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n = nums.length;
4        int ans[] = new int[n*2];
5        int rev[] = new int[n];
6        int index = 0;
7        int ni = 0;
8        for (int i=0; i<n; i++){
9            ans[i] = nums[i];
10        }
11        for (int i=n-1; i>=0; i--){
12            rev[index] = nums[i];
13            index++;
14        }
15
16        for (int i=n; i<n*2; i++){
17            ans[i] = rev[ni];
18            ni++;
19        }
20        return ans;
21    }
22}