// Last updated: 7/9/2026, 3:07:27 PM
class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        for (int x:nums) {
            if (x==0) return 0;
            if (x<0) count++; 
        }
        return (count%2==0)?1:-1;
    }
}