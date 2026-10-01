// Last updated: 10/1/2026, 1:37:40 PM
1class Solution {
2    public int minMovesToSeat(int[] seats, int[] students) {
3        Arrays.sort(seats);
4        Arrays.sort(students);
5        int res = 0;
6        for (int i=0; i<seats.length; i++){
7            res += Math.abs(students[i] - seats[i]);
8        }
9        return res;
10    }
11}