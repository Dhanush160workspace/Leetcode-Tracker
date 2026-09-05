// Last updated: 9/5/2026, 9:20:42 PM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] ans = new char[s.length()];
4        for(int i=0;i<s.length();i++){
5            ans[indices[i]]=s.charAt(i);
6        }
7        return new String(ans);
8    }
9}