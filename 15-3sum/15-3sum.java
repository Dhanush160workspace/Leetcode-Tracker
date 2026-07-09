// Last updated: 7/9/2026, 3:11:44 PM
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Optimization: If the current number is > 0, the remaining numbers 
            // will also be > 0, so their sum can never be 0.
            if (nums[i] > 0) {
                break;
            }
            
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Step 2: Use two pointers to find pairs that sum up to -nums[i]
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers inward after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Sum is too small, move left pointer to increase sum
                } else {
                    right--; // Sum is too large, move right pointer to decrease sum
                }
            }
        }
        
        return result;
    }
}