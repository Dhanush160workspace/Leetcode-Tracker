// Last updated: 9/4/2026, 1:17:47 PM
1class Solution {
2    public String convertDateToBinary(String date) {
3        String[] parts = date.split("-");
4
5        String yearBinary = Integer.toBinaryString(Integer.parseInt(parts[0]));
6        String monthBinary = Integer.toBinaryString(Integer.parseInt(parts[1]));
7        String dayBinary = Integer.toBinaryString(Integer.parseInt(parts[2]));
8
9        return yearBinary + "-" + monthBinary + "-" + dayBinary;
10    }
11}
12