// Last updated: 9/4/2026, 1:27:44 PM
1import java.util.ArrayList;
2import java.util.Arrays;
3import java.util.List;
4
5class Solution {
6    public List<Integer> findMissingElements(int[] nums) {
7        Arrays.sort(nums);
8        List<Integer> list = new ArrayList<>();
9        int min = nums[0];
10        int max = nums[nums.length - 1];
11
12        for (int i = 0; i < nums.length - 1; i++) {
13            int current = nums[i];
14            int next = nums[i + 1];
15
16            for (int missing = current + 1; missing < next; missing++) {
17                list.add(missing);
18            }
19        }
20        
21        return list;
22    }
23}
24