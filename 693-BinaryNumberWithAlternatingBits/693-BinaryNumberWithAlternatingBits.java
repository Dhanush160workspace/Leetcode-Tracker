// Last updated: 7/9/2026, 3:09:04 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int ini = n&1;
        n = n>>1;
        while(n!=0){
            if ((n & 1) == ini) return false;  
            ini = n & 1;      
            n = n >> 1;
        }
        return true;
    }
}