// Last updated: 7/9/2026, 3:07:21 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}