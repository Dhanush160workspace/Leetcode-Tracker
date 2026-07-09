// Last updated: 7/9/2026, 3:09:22 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentones = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 1){
                currentones++;
                if (currentones > max){
                    max = currentones;
                }
            } else {
                currentones = 0;
            }
        }
        return max;
    }
}