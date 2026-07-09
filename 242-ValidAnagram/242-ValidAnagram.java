// Last updated: 7/9/2026, 3:09:51 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch:t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)-1);
        }

        for(int x:map.values()){
            if (x!=0) return false;
        }

        return true;
    }
}