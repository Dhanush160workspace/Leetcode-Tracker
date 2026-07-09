// Last updated: 7/9/2026, 3:11:05 PM
class Solution {
    public int[] plusOne(int[] arr) {
        for (int i=arr.length-1; i>=0; i--){
            if (arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] NEW = new int[arr.length+1];
        NEW[0] = 1;
        return NEW;
    }
}