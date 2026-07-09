// Last updated: 7/9/2026, 3:09:54 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i=0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) +1);
        }
        for (Map.Entry<Integer, Integer> en: mp.entrySet()){
            if (en.getValue() > (n/3)){
                ans.add(en.getKey());
            }
        }
        return ans;
    }
}