// Last updated: 7/9/2026, 3:10:32 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i=0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        for (Map.Entry<Integer, Integer> en: mp.entrySet()){
            if (en.getValue() > (n/2)){
                return en.getKey();
            }
        }
        return 0;
    }
}