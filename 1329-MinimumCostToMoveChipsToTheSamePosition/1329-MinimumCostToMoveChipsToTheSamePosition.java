// Last updated: 7/9/2026, 3:08:31 PM
class Solution {
    public int minCostToMoveChips(int[] pos) {
        // int cost = 0;
        // int ini = position[0];
        // for (int i=1;i<position.length;i++){
        //     int diff = position[i] - ini;
        //     if (diff%2 == 0){
        //         cost += 0;
        //     } else if (cost%2 == 1){
        //         cost++;
        //     }
        // }
        // return cost;

        int oddc = 0;
        int evenc =  0;
        for (int i=0;i<pos.length;i++){
            if (pos[i]%2==1) oddc ++;
            if (pos[i]%2==0) evenc ++;
        }

        // if (oddc>evenc) return evenc;
        // else return oddc;
        
        return evenc>oddc? oddc:evenc;
    }
}