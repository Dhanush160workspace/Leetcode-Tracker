// Last updated: 9/5/2026, 4:47:01 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder ans = new StringBuilder();
4
5        for (String word : words) {
6            int sum = 0;
7
8            for (char c : word.toCharArray()) {
9                sum += weights[c - 'a'];
10            }
11
12            int x = sum % 26;
13            ans.append((char)('z' - x));
14        }
15
16        return ans.toString();
17    }
18}