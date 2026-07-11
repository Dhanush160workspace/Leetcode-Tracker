// Last updated: 7/11/2026, 10:27:02 AM
1import java.util.HashMap;
2
3class Solution {
4    public long maximumSubarraySum(int[] nums, int k) {
5        int n = nums.length;
6        long maxSum = Long.MIN_VALUE;
7        
8        // prefixSum tracking to calculate subarray sums in O(1) time
9        long[] prefixSum = new long[n + 1];
10        for (int i = 0; i < n; i++) {
11            prefixSum[i + 1] = prefixSum[i] + nums[i];
12        }
13        
14        // Map stores: value -> minimum prefix sum seen before this value
15        HashMap<Integer, Long> minPrefixMap = new HashMap<>();
16        
17        for (int j = 0; j < n; j++) {
18            // The two targets that satisfy |nums[j] - target| == k
19            int target1 = nums[j] - k;
20            int target2 = nums[j] + k;
21            
22            // Check if target1 exists as a valid starting element
23            if (minPrefixMap.containsKey(target1)) {
24                long currentSum = prefixSum[j + 1] - minPrefixMap.get(target1);
25                maxSum = Math.max(maxSum, currentSum);
26            }
27            
28            // Check if target2 exists as a valid starting element
29            if (minPrefixMap.containsKey(target2)) {
30                long currentSum = prefixSum[j + 1] - minPrefixMap.get(target2);
31                maxSum = Math.max(maxSum, currentSum);
32            }
33            
34            // We want to MINIMIZE the prefixSum we subtract to MAXIMIZE our subarray sum
35            if (!minPrefixMap.containsKey(nums[j]) || prefixSum[j] < minPrefixMap.get(nums[j])) {
36                minPrefixMap.put(nums[j], prefixSum[j]);
37            }
38        }
39        
40        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
41    }
42}