// Last updated: 7/9/2026, 3:07:40 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();
        for (int i=0; i<candies.length; i++){
            arr.add(true);
            int now = candies[i] + extraCandies;
            for (int candy : candies){
                if (now < candy){
                    arr.set(i, false);
                    break;
                }
            }
        }
        return arr;
    }
}