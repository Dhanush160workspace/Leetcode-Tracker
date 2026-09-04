// Last updated: 9/4/2026, 1:00:14 PM
1class Solution {
2    public int sum(int num){
3        int sum = 0;
4        while(num>0){
5            sum += num%10;
6            num = num/10;
7        }
8        return sum;
9    }
10    public int minElement(int[] nums) {
11        int[] ans = new int[nums.length];
12        for (int i=0; i<nums.length; i++){
13            int now = sum(nums[i]);
14            ans[i] = now;
15        }
16        int min = 100000000;
17        for (int val:ans){
18            if (val < min){
19                min = val;
20            }
21        }
22        return min;
23    }
24}