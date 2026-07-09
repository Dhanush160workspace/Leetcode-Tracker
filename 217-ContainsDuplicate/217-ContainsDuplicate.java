// Last updated: 7/9/2026, 3:09:55 PM
import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // O(n log n)
        for (int i = 1; i < nums.length; i++) {
            // After sorting, duplicates will be adjacent
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }
}