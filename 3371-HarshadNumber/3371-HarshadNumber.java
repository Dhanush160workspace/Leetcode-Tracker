// Last updated: 7/9/2026, 3:06:07 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int X=x;
        while(x>0){
            sum+= x%10;
            x = x/10;
        }
        if (X%sum==0) return sum;
        else return -1;
        
    }
}