// Last updated: 9/5/2026, 9:42:00 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase();
4        String str = "";
5        
6        for(int i=0;i<s.length();i++){
7            if(Character.isLetterOrDigit(s.charAt(i))){
8                str += s.charAt(i);
9            }
10        }
11        
12        String rev = "";
13        
14        for(int i=str.length()-1;i>=0;i--){
15            rev += str.charAt(i);
16        }
17        
18        return str.equals(rev);
19    }
20}