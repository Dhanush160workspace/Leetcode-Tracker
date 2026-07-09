// Last updated: 7/9/2026, 3:10:57 PM
class Solution {
    public void sortColors(int[] nums) {
        int zc = 0;
        int oc = 0;
        int tc = 0;
        for (int num:nums){
            if (num==0) zc++;
            else if (num==1) oc++;
            else if (num==2) tc++;
        }
        int index = 0;
        while(zc!=0){
            nums[index] = 0;
            zc--;
            index++;
        }
        while(oc!=0){
            nums[index] = 1;
            oc--;
            index++;
        }
        while(tc!=0){
            nums[index] = 2;
            tc--;
            index++;
        }
    }
}