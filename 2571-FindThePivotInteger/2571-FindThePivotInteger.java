// Last updated: 7/9/2026, 3:06:34 PM
import java.util.*;
class Solution {
    public int pivotInteger(int n) {
        // int pivot = 0;
        // int Sum = 0;
        // for (int i=n;i>0;i--){
        //     int sum = 0;
        //     for (int j=1;j<n+1;j++){
        //         sum += j;
        //         if (sum == i){
        //             pivot = sum;
        //         }
        //     }
        //     Sum = sum;
        // }
        // return Sum;
        for (int x=1;x<=n;x++){
            int ls=0;
            for (int i=1;i<=x;i++){
                ls+=i;
            }
            int rs=0;
            for (int j=x;j<=n;j++){
                rs+=j;
            }
            if (ls == rs) return x;
        }
        return -1;
    }
}