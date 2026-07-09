// Last updated: 7/9/2026, 3:05:44 PM
class Solution {
    public int maxFreqSum(String s) {
        char[] arr = s.toCharArray();
        char[] vowels = {'a','e','i','o','u'};
        char[] con = {'q','w','r','t','y','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        char[] vfeq = new char[5];
        int m =0;
        char[] cfeq = new char[21];
        int n =0;
        
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<5; j++){
                if (arr[i] == vowels[j]){
                    vfeq[j] += 1;
                }
            }
        }

        for (int i=0; i<5; i++){
            if (vfeq[i] > m){
                m = vfeq[i];
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<21; j++){
                if (arr[i] == con[j]){
                    cfeq[j] += 1;
                }
            }
        }

        for (int i=0; i<21; i++){
            if (cfeq[i] > n){
                n = cfeq[i];
            }
        }

        return (m + n);
    }
}