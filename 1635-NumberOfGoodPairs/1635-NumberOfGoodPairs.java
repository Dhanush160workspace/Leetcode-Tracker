// Last updated: 7/9/2026, 3:07:31 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pair = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }
        // for(int m:map.values()){
        //     count += (m * (m-1))/2;
        // }
        // return count;

        for(int i=0; i<nums.length; i++){
            pair += map.getOrDefault(nums[i],0);
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        return pair;
    }
}