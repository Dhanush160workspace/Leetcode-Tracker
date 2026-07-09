// Last updated: 7/9/2026, 3:08:57 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char i:jewels.toCharArray()){
            set.add(i);
        }
        int count = 0;
        for (char j:stones.toCharArray()){
            if (set.contains(j)) count++;
        }
        return count;
    }
}