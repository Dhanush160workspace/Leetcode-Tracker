// Last updated: 7/9/2026, 3:05:58 PM
import java.util.*;
class Solution {
    public boolean canAliceWin(int[] nums) {
        int len = nums.length;
        int element;
        int sumS = 0;
        int sumD = 0;
        for (int i=0;i<len;i++){
            element = nums[i];
            if (element%10 == element){
                sumS += element;
            } else {
                sumD += element;
            }
        }
        if (sumS == sumD){
            return false;
        } else {
            return true;
        }
    }
}