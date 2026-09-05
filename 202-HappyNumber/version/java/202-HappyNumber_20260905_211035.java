// Last updated: 9/5/2026, 9:10:35 PM
1class Solution {
2    public int numberOfSteps(int num) {
3        int s = 0 ;
4        while (num!=0){
5            if (num%2 == 0){
6                num = num/2;
7                s++;
8            } else {
9                num--;
10                s++;
11            }
12        }
13        return s;
14    }
15}