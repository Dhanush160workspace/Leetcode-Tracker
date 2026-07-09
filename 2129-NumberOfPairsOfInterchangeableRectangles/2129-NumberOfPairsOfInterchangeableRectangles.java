// Last updated: 7/9/2026, 3:06:49 PM
class Solution {
    public long interchangeableRectangles(int[][] rec) {
        long res = 0;
        Map<Double, Integer> map = new HashMap<>();
        for (int[] r:rec){
            double ratio = (double)r[0]/r[1];
            res = res + map.getOrDefault(ratio, 0);
            map.put(ratio, map.getOrDefault(ratio, 0)+1);
        }
        return res;
    }
}