// Last updated: 7/9/2026, 3:12:03 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int[] charMap = new int[128];
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            left = Math.max(left, charMap[rightChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            charMap[rightChar] = right + 1;
        }
        
        return maxLength;
    }
}