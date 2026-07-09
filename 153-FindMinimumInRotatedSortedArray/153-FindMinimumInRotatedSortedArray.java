// Last updated: 7/9/2026, 3:10:36 PM
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while (low < high){
            mid = (low+high) / 2;
            if (nums[mid] > nums[high]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}