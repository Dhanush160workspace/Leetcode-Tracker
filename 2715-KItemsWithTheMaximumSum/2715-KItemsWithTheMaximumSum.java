// Last updated: 7/9/2026, 3:06:25 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // if (k <= numOnes) {
        //     return k; 
        // } else if (k <= numOnes + numZeros) {
        //     return numOnes; 
        // } else {
            
        //     int negCount = k - (numOnes + numZeros);
        //     return numOnes - negCount;
        // }
       
        return Math.min(numOnes, k) - Math.max(0, k - (numOnes + numZeros));

    }
}