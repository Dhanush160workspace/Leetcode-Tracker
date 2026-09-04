// Last updated: 9/4/2026, 1:44:22 PM
1class Solution {
2    public String interpret(String command) {
3        int index = 0;
4        StringBuilder sb = new StringBuilder("");
5        
6        while (index < command.length()) {
7            if (command.charAt(index) == 'G') {
8                sb.append("G");
9                index++;
10            } 
11            else if (command.charAt(index) == '(') {
12                if (command.charAt(index + 1) == ')') {
13                    sb.append("o");
14                    index += 2;
15                } 
16                else if (command.charAt(index + 1) == 'a') {
17                    sb.append("al"); 
18                    index += 4;
19                }
20            }
21        }
22        return sb.toString();
23    }
24}
25