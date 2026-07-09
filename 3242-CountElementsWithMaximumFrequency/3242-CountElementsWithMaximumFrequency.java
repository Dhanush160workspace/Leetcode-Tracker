// Last updated: 7/9/2026, 3:06:08 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int max = 0;
        for (int value:map.values()){
            if (value>max){
                max = value;
            }
        }
        int count = 0;
        for (int value:map.values()){
            if (value == max){
                count+=value;
            }
        }
        return count;
    }
}