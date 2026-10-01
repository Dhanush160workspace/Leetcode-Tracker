// Last updated: 10/1/2026, 1:46:24 PM
1class Solution {
2    public int[] createTargetArray(int[] nums, int[] index) {
3        ArrayList<Integer> al = new ArrayList<>();
4        for (int i=0; i<nums.length; i++){
5            al.add(index[i], nums[i]);
6        }
7        int ans[] = new int[nums.length];
8        for (int i=0; i<nums.length; i++){
9            ans[i] = al.get(i);
10        }
11        return ans;
12    }
13}