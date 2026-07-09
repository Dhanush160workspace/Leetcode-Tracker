// Last updated: 7/9/2026, 3:07:55 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while(n!=0){
            prod *= n%10;
            sum += n%10;
            n = n / 10;
        }
        return (prod-sum);
    }
}