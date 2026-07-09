// Last updated: 7/9/2026, 3:10:54 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int c = 0;
        for (int i=0; i<nums1.length; i++){
            if (nums1[i] == 0){
                al.add(i);
            }
        }
        for (int i=0; i<nums2.length; i++){
            if (nums2[i] == 0){
                al.add(i);
            }
        }
        int na = nums2.length-1;
        for(int num:al){
            if (c<=na){
                nums1[num] = nums2[c];
            } else {
                break;
            }
            c++;
        }
        Arrays.sort(nums1);
    }
}