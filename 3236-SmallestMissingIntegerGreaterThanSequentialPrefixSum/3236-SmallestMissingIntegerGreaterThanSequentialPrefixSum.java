// Last updated: 7/9/2026, 3:06:10 PM
class Solution {
    public int missingInteger(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                max += nums[i + 1];
            } else {
                break;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(max)) {
            max++;
        }
        return max;
    }
}