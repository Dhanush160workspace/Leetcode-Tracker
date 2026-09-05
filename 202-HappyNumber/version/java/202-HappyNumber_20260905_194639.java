// Last updated: 9/5/2026, 7:46:39 PM
1class Solution {
2    public boolean isUgly(int n) {
3        if(n <= 0) {
4            return false;
5        }
6
7        while(n % 2 == 0) {
8            n = n / 2;
9        }
10
11        while(n % 3 == 0) {
12            n = n / 3;
13        }
14
15        while(n % 5 == 0) {
16            n = n / 5;
17        }
18
19        return n == 1;
20    }
21}