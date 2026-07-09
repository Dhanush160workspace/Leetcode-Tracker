// Last updated: 7/9/2026, 3:05:46 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int ele:nums){
            sum += ele;
        }
        if (sum%k == 0){
            return 0;
        } else {
            return sum%k;
        }
    }
}