// Last updated: 7/9/2026, 3:06:28 PM
class Solution {
    static int elementSum(int[] nums){
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum+= nums[i];
        }
        return sum;
    }
    static int getSum(int num){
        int sum = 0;
        while(num!=0){
            sum+= num%10;
            num = num/10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int elementSum = elementSum(nums);
        int totalSum = 0;
        for (int i=0;i<nums.length;i++){
            totalSum+= getSum(nums[i]);
        }
        return Math.abs(elementSum-totalSum);
    }
}