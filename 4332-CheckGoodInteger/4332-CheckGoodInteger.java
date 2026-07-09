// Last updated: 7/9/2026, 3:05:41 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int org = n;
        int digitSum = 0;
        int squareSum = 0;
        while(n>0){
            digitSum += n%10;
            n = n/10;
        }
        while(org>0){
            squareSum += (Math.pow(org%10, 2));
            org = org/10;
        }
        if ((squareSum - digitSum) >= 50){
            return true;
        } 
        return false;
    }
}