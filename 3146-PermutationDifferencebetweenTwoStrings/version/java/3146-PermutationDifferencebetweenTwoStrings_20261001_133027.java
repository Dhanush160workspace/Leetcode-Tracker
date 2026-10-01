// Last updated: 10/1/2026, 1:30:27 PM
1class Solution {
2    public int findPermutationDifference(String s, String t) {
3        int sum = 0;
4        for (int i=0; i<s.length(); i++){
5            char ch = s.charAt(i);
6            int pos = t.indexOf(ch);
7            sum += Math.abs(i - pos);
8        }
9        return sum;
10    }
11}