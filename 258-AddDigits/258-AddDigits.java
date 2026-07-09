// Last updated: 7/9/2026, 3:09:49 PM
class Solution {
    static int Add(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    static int Length(int n){
        return (n==0)?1:(int)Math.log10(n)+1;
    }
    public int addDigits(int num) {
        while(Length(num) != 1){
            int newnum = Add(num);
            num = newnum;
        }
        return num;
    }
}