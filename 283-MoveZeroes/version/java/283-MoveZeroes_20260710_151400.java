// Last updated: 7/10/2026, 3:14:00 PM
1// class Solution {
2//     public int[] sortArrayByParity(int[] nums) {
3//         int n = nums.length;
4//         int dup[] = nums;
5//         int res[] = new int[n];
6//         int index = 0;
7//         for (int i=0; i<n; i++){
8//             if (nums[i]%2 == 0){
9//                 res[index] = nums[i];
10//                 index++;
11//             }
12//         }
13//         for (int i=0; i<n; i++){
14//             if (dup[i]%2 != 0){
15//                 res[index] = dup[i];
16//                 index++;
17//             }
18//         }
19//         return res;
20//     }
21// }
22
23class Solution {
24    public int[] sortArrayByParity(int[] nums) {
25        int left = 0;
26        int right = nums.length-1;
27        while(left < right){
28            if (nums[left]%2 == 0){
29                left++;
30            } else if (nums[right]%2 != 0){
31                right--;
32            } else {
33                int temp = nums[left];
34                nums[left] = nums[right];
35                nums[right] = temp;
36                left++;
37                right--;
38            }
39        }
40        return nums;
41    }
42}