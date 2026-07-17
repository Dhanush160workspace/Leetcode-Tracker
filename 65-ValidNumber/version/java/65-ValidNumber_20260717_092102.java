// Last updated: 7/17/2026, 9:21:02 AM
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> result = new ArrayList<>();
4        int i = 0;
5
6        while (i < words.length) {
7            int j = i;
8            int lineLength = 0;
9
10            while (j < words.length && lineLength + words[j].length() + (j - i) <= maxWidth) {
11                lineLength += words[j].length();
12                j++;
13            }
14
15            int gaps = j - i - 1;
16            StringBuilder sb = new StringBuilder();
17
18            if (j == words.length || gaps == 0) {
19                for (int k = i; k < j; k++) {
20                    sb.append(words[k]);
21                    if (k != j - 1) sb.append(" ");
22                }
23                while (sb.length() < maxWidth) sb.append(" ");
24            } else {
25                int spaces = (maxWidth - lineLength) / gaps;
26                int extra = (maxWidth - lineLength) % gaps;
27
28                for (int k = i; k < j - 1; k++) {
29                    sb.append(words[k]);
30                    for (int s = 0; s < spaces + (k - i < extra ? 1 : 0); s++) {
31                        sb.append(" ");
32                    }
33                }
34                sb.append(words[j - 1]);
35            }
36
37            result.add(sb.toString());
38            i = j;
39        }
40
41        return result;
42    }
43}