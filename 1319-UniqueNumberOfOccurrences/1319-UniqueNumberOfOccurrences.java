// Last updated: 7/9/2026, 3:08:28 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}