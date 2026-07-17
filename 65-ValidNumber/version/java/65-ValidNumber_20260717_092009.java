// Last updated: 7/17/2026, 9:20:09 AM
1class Solution {
2    public boolean isNumber(String s) {
3        s = s.trim();
4
5        boolean num = false;
6        boolean exp = false;
7        boolean dot = false;
8
9        for (int i = 0; i < s.length(); i++) {
10            char ch = s.charAt(i);
11
12            if (Character.isDigit(ch)) {
13                num = true;
14            } 
15            else if (ch == '.') {
16                if (dot || exp) return false;
17                dot = true;
18            } 
19            else if (ch == 'e' || ch == 'E') {
20                if (exp || !num) return false;
21                exp = true;
22                num = false;
23            } 
24            else if (ch == '+' || ch == '-') {
25                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
26                    return false;
27            } 
28            else {
29                return false;
30            }
31        }
32
33        return num;
34    }
35}