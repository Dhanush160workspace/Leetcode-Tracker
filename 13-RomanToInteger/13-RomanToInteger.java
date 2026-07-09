// Last updated: 7/9/2026, 3:11:47 PM
class Solution {
    static int convert(char a){
        if (a=='I') return 1;
        else if (a=='V') return 5;
        else if (a=='X') return 10;
        else if (a=='L') return 50;
        else if (a=='C') return 100;
        else if (a=='D') return 500;
        else if (a=='M') return 1000;
        return -1;
    }
    public int romanToInt(String s) {
        int n = s.length();
        int ans = convert(s.charAt(n - 1));
        for(int i=n-2; i>=0; i--){
            int a = convert(s.charAt(i));
            int b = convert(s.charAt(i+1));
            if (a<b){
                ans -= a;
            } else {
                ans += a;
            }
        }
        return ans;
    }
}