// Last updated: 7/9/2026, 3:07:52 PM
class Solution {
    
    static int lenofDigit(int num){
        if (num<10){
            return 1;
        } else {
            return (int)Math.log10(num)+1;
        }
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        int[] arr = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            arr[i] = lenofDigit(nums[i]);
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                count+=1;
            } 
        }
        return count;
    }
}