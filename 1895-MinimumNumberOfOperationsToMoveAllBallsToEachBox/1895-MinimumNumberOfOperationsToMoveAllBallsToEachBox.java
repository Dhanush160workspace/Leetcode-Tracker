// Last updated: 7/9/2026, 3:06:59 PM
class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        char[] carr = boxes.toCharArray();
        for (int i=0; i<boxes.length(); i++){
            int dist = 0;
            for (int j=0; j<boxes.length(); j++){
                if (carr[j] == '1') dist+=(Math.abs(i-j));
            }
            arr[i] = dist;
        }
        return arr;
    }
}