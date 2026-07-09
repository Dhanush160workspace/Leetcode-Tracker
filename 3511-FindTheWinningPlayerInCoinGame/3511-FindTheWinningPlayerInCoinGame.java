// Last updated: 7/9/2026, 3:06:00 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int count = 0;
        while(y>=0 && x>=0){
            x = x - 1;
            y = y - 4;
            count++;
        } 
        if (count%2==0) {
            return "Alice";
        } else {
            return "Bob";
        }
    }
}