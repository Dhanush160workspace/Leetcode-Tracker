// Last updated: 7/9/2026, 3:06:43 PM
// class Solution {
//     public int mostFrequentEven(int[] nums) {
//         // int n = nums.length;
//         // int max = 0;
//         // List<Integer> list = new ArrayList<>();
//         // for (int num:nums){
//         //     if (num%2==0) list.add(num);
//         // }
//         // HashMap<Integer, Integer> mp = new HashMap<>();
//         // int c = 0;
//         // for (int num:list){
//         //     mp.put(num, mp.getOrDefault(num, 0)+1);
//         //     c++;
//         // }
//         // if (c==0) return -1;
//         // List<Integer> comp = new ArrayList<>();
//         // int com = 0;
//         // for (Map.Entry<Integer, Integer> en:mp.entrySet()){
//         //     if (en.getKey() == 0 && en.getValue()>2) return 0;
//         //     if (en.getValue() > max){
//         //         if (en.getValue() == max){
//         //             comp.add(en.getKey());
//         //             com++;
//         //         }
//         //         max = en.getKey();
//         //     }
//         // }
//         // int min = 999999999;
//         // for (int co:comp){
//         //     if (co<min){
//         //         min = co;
//         //     }
//         // }
//         // if (com>0) return min;
//         // return max;
//         HashMap<Integer, Integer> mp = new HashMap<>();
//         int def = 0;
//         int ans = -1;
//         for (int num:nums){
//             if (num %2 == 0){
//                 int freq =  mp.getOrDefault(num, 0)+1;
//                 mp.put(num, freq);
//                 if (freq > ans){
//                     def = freq;
//                     ans = num;
//                 }
//                 if (freq == ans && num < ans){
//                     ans = num;
//                 }
//             }
//         }
//         return ans;
//     }
// }

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int ans = -1;
        int maxFreq = 0;

        for (int num : nums) {
            // Step 1: Filter even numbers
            if (num % 2 == 0) {
                int currentFreq = freqMap.getOrDefault(num, 0) + 1;
                freqMap.put(num, currentFreq);

                // Step 2: Track the most frequent / smallest even element
                if (currentFreq > maxFreq) {
                    maxFreq = currentFreq;
                    ans = num;
                } else if (currentFreq == maxFreq && num < ans) {
                    ans = num;
                }
            }
        }

        return ans;
    }
}