// Last updated: 9/5/2026, 9:38:09 PM
1class Solution {
2    public void reverseString(char[] s) {
3        char[] clone = new char[s.length];
4        for (int i=0; i<s.length; i++){
5            clone[i] = s[i];
6        }
7        int len = s.length-1;
8        for (int i=0; i<s.length; i++){
9            s[i] = clone[len];
10            len--;
11        }
12        
13    }
14}