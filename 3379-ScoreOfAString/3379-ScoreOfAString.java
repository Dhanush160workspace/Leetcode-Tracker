// Last updated: 7/9/2026, 3:06:05 PM
class Solution {
    public int scoreOfString(String str) {
        int sol = 0;
        for (int i=0; i<str.length()-1; i++){
            sol += Math.abs(str.charAt(i) - str.charAt(i+1));
        }
        return sol;
    }
}