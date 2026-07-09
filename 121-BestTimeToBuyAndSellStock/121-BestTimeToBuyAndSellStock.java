// Last updated: 7/9/2026, 3:10:46 PM
class Solution {
    public int maxProfit(int[] p) {
        // int max = -1;
        // int index = 0;
        // int min = 100;
        // for(int i=0; i<prices.length; i++){
        //     if(prices[i] < min){
        //         min = prices[i];
        //         index = i;
        //     }
        // }
        // for(int i=index+1; i<prices.length; i++){
        //     if(prices[i] > max){
        //         max = prices[i];
        //     }
        // }
        // if (index>prices.length-2) return 0;
        // return (max-min);

        // int n = prices.length;
        // int maxp =0;
        // for (int i=0; i<n; i++){
        //     for (int j=i+1; j<n; j++){
        //         int cp = prices[j] - prices[i];
        //         if (maxp < cp) maxp = cp;
        //     }
        // }
        // return maxp;

        int maxp = 0;
        int minbp = p[0];

        for (int i=0; i<p.length; i++){
            int sellp = p[i];
            if (sellp > minbp){
                int pr = sellp - minbp;
                if (pr>maxp) maxp = pr;
            } else {
                minbp = sellp;
            }
        }

        return (maxp);
    }
}