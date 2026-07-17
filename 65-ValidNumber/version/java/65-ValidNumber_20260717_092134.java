// Last updated: 7/17/2026, 9:21:34 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) return "";
4
5        int[] count = new int[128];
6
7        for (char c : t.toCharArray())
8            count[c]++;
9
10        int left = 0, right = 0;
11        int required = t.length();
12        int minLen = Integer.MAX_VALUE;
13        int start = 0;
14
15        while (right < s.length()) {
16            char c = s.charAt(right);
17
18            if (count[c] > 0)
19                required--;
20
21            count[c]--;
22            right++;
23
24            while (required == 0) {
25                if (right - left < minLen) {
26                    minLen = right - left;
27                    start = left;
28                }
29
30                char ch = s.charAt(left);
31                count[ch]++;
32
33                if (count[ch] > 0)
34                    required++;
35
36                left++;
37            }
38        }
39
40        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
41    }
42}