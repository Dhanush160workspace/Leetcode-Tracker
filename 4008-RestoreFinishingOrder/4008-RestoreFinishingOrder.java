// Last updated: 7/9/2026, 3:05:36 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        int count = 0;

        for (int i=0; i<order.length; i++){
            int num = order[i];
            for (int j=0; j<friends.length; j++){
                if (friends[j] == num){
                    arr[count] = friends[j];
                    count++;
                }
            }
        }

        return arr;
    }
}