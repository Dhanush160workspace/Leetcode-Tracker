// Last updated: 7/9/2026, 3:06:47 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op:operations){
            x += op.charAt(1)=='+'? 1:-1;
        }
        return x;
    }
}