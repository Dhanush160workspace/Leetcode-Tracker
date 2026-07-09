// Last updated: 7/9/2026, 3:08:37 PM
class Solution {
    public int[] replaceElements(int[] arr) {

        // int[] narr = new int[arr.length];

        // for (int i=0;i<arr.length-1;i++){
        //     int max = arr[i+1];
        //     for (int j=i+1;j<arr.length;j++){
        //         if (max <= arr[j]){
        //             max = arr[j];
        //         }
        //     }
        //     narr[i] = max;
        // }
        // narr[arr.length-1] = -1;
        // return narr;

        int max = -1;
        int cmax = Integer.MIN_VALUE;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]>cmax) cmax=arr[i];
            arr[i]=max;
            max=cmax;
        }
        return arr;
    }
}