// Last updated: 7/9/2026, 3:07:46 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i=0; i<arr.length; i++){
            int ele = arr[i];
            for (int j=0; j<arr.length; j++){
                if (i==j) continue;
                if (arr[j]*2 == ele){
                    return true;
                }
            }
        }
        return false;
    }
}