// Last updated: 9/4/2026, 1:14:33 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int res = 0;
4        for (int i=0; i<s.length(); i++){
5            int ascii = 122 - (int) s.charAt(i)+1;
6            res+= ascii * (i+1);
7        }
8        return res;
9    }
10}