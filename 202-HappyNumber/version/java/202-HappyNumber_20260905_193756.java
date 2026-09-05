// Last updated: 9/5/2026, 7:37:56 PM
1class Solution {
2    public int sum(int n) {
3        int sum = 0;
4        while(n > 0) {
5            int digit = n % 10;
6            sum += digit * digit;
7            n = n / 10;
8        }
9        return sum;
10    }
11
12    public boolean isHappy(int n) {
13        HashSet<Integer> set = new HashSet<>();
14
15        while(n != 1) {
16            if(set.contains(n)) {
17                return false;
18            }
19            set.add(n);
20            n = sum(n);
21        }
22
23        return true;
24    }
25}