// Last updated: 7/9/2026, 3:10:00 PM
class Solution {
    public int countPrimes(int n) {
        if (n<=2){
            return 0;
        }
        boolean[] check = new boolean[n];
        int count = 0;
        for (int i=2; i*i<n; i++){
            if (!check[i]){
                for (int j=i*i; j<n; j+=i){
                    check[j] = true;
                }
            }
        }
        for (int i=2; i<n; i++){
            if (!check[i]) count++;
        }
        return count;
    }
}