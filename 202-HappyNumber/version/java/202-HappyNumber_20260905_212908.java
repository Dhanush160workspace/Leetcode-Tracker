// Last updated: 9/5/2026, 9:29:08 PM
1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int max = 0;
4        for (int i=0; i<sentences.length; i++){
5            int count = 1;
6            for (int j=0; j<sentences[i].length(); j++){
7                if (sentences[i].charAt(j) == ' '){
8                    count++;
9                }
10            }
11            if (count > max){
12                max = count;
13            }
14        }
15        return max;
16    }
17}