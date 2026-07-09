// Last updated: 7/9/2026, 3:07:36 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int count = 0;
        int Count = 1;

        for (int i=0; i<n; i++){
            arr[count] = nums[i];
            count+=2;
        }
        for (int i=n; i<nums.length; i++){
            arr[Count] = nums[i];
            Count+=2;
        }

        return arr;
    }
}