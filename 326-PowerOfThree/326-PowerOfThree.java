// Last updated: 7/9/2026, 3:09:44 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>=3){
            if (n%3!=0) return false;
            n = n/3;
        }
        return n==1;
    }
}