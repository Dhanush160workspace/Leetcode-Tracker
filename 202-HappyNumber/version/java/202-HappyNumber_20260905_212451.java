// Last updated: 9/5/2026, 9:24:51 PM
1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3        String s1 = "";
4        String s2 = "";
5        for (int i=0; i<word1.length; i++){
6            s1 = s1 + word1[i];
7        }
8        for (int i=0; i<word2.length; i++){
9            s2 = s2 + word2[i];
10        }
11        return s1.equals(s2);
12    }
13}