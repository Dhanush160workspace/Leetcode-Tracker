// Last updated: 7/9/2026, 3:06:37 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%6==0){
                    sum+=nums[i];
                    count++;
            }
        }
        if (count>0) return (sum/count);
        else return 0;
    }
}