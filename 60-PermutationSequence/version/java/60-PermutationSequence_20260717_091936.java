// Last updated: 7/17/2026, 9:19:36 AM
1class Solution {
2    public String getPermutation(int n, int k) {
3
4        List<Integer> numbers = new ArrayList<>();
5        int fact = 1;
6
7        for (int i = 1; i < n; i++) {
8            fact *= i;
9            numbers.add(i);
10        }
11        numbers.add(n);
12
13        k--; // convert to 0-based indexing
14
15        StringBuilder ans = new StringBuilder();
16
17        while (true) {
18
19            ans.append(numbers.get(k / fact));
20
21            numbers.remove(k / fact);
22
23            if (numbers.size() == 0)
24                break;
25
26            k = k % fact;
27
28            fact = fact / numbers.size();
29        }
30
31        return ans.toString();
32    }
33}