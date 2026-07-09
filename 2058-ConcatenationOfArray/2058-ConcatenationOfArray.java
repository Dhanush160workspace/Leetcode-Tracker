// Last updated: 7/9/2026, 3:07:18 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        System.arraycopy(nums, 0, res, 0, nums.length);
        System.arraycopy(nums, 0, res, nums.length, nums.length);
        return res;
    }
}