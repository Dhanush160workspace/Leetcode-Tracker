// Last updated: 7/9/2026, 3:06:13 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> alist = new ArrayList<>();

        //Optimal

        for (int i=0; i<words.length; i++){
            if (words[i].indexOf(x) != -1){
                alist.add(i);
            }
        }

        return alist;
    }
}