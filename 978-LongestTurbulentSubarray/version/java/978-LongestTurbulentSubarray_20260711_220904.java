// Last updated: 7/11/2026, 10:09:04 PM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int n = arr.length;
4        if (n < 2) return n;
5        
6        int maxLen = 1;
7        int anchor = 0; // Tracks the start of the current turbulent window
8
9        for (int i = 1; i < n; i++) {
10            // Compare current element with the previous one
11            int c = Integer.compare(arr[i - 1], arr[i]);
12            
13            if (c == 0) {
14                // Adjacent elements are equal -> turbulence breaks completely
15                anchor = i;
16            } else if (i == n - 1 || c * Integer.compare(arr[i], arr[i + 1]) != -1) {
17                /* Check if the sign fails to flip at the next transition.
18                  If the product of comparisons is NOT -1, it means the pattern breaks 
19                  (e.g., both steps went up, both went down, or the next pair is equal).
20                  This means the turbulent window must end right here at index i.
21                */
22                maxLen = Math.max(maxLen, i - anchor + 1);
23                anchor = i; // Reset the anchor to start a new window
24            }
25        }
26        
27        return maxLen;
28    }
29}