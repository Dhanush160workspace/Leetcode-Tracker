// Last updated: 7/9/2026, 3:09:43 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;
        long j = num;
        long mid = 0;
        while(i<=j){
            mid = (i+j) / 2;
            if ((mid*mid) == num){
                return true;
            } else if ((mid*mid) > num){
                j = mid -1;
            } else {
                i = mid +1;
            }
        }
        return false;
    }
}