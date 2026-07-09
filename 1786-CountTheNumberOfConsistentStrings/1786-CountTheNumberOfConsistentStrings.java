// Last updated: 7/9/2026, 3:07:20 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for (int i=0; i<words.length; i++){
            boolean isConsistent = true;
            for (int j=0; j<words[i].length(); j++){
                if (allowed.indexOf(words[i].charAt(j)) == -1){
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent){
                res++;
            }
        }
        return res;
    }
}