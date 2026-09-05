// Last updated: 9/5/2026, 8:27:12 PM
1class Solution {
2    public String toHex(int num) {
3        if(num == 0) {
4            return "0";
5        }
6        String result = "";
7        while(num != 0) {
8            int digit = num & 15;
9            if(digit < 10) {
10                result = (char)('0' + digit) + result;
11            } else {
12                result = (char)('a' + digit - 10) + result;
13            }
14            num = num >>> 4;
15        }
16
17        return result;
18    }
19}