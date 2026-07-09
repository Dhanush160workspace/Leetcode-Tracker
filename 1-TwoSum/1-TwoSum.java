// Last updated: 7/9/2026, 3:12:05 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if (map.containsKey(nums[i])){
                // arr[0] = i;
                // arr[1] = map.get(nums[i]);
                return new int[]{i, map.get(nums[i])};
            }else{
                map.put(x, i);
            }
        } 
        return new int[]{-1, -1};
    }
}