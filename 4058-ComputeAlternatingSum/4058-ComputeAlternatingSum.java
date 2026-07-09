// Last updated: 7/9/2026, 3:05:32 PM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i+=2){
            sum += nums[i];
        } 
        for (int i=1; i<nums.length; i+=2){
            sum -= nums[i];
        }
        return sum;
    }
}