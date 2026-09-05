// Last updated: 9/5/2026, 7:58:11 PM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if (n==0){
4            return false;
5        }
6        while(n%4==0){
7            n = n/4;
8        }
9        return n==1;
10    }
11}