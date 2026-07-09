// Last updated: 7/9/2026, 3:10:44 PM
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        for (int num:nums){
            if (hs.contains(num)){
                hs.remove(num);
            } else {
                hs.add(num);
            }
        }
        return hs.iterator().next();
    }
}