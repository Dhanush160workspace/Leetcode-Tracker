// Last updated: 7/9/2026, 3:09:20 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);

        for (int num:nums2){
            while(!stack.empty() && num>stack.peek()){
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i=0; i<nums1.length; i++){
            if (map.containsKey(nums1[i])){
                res[i] = map.get(nums1[i]);
            }
        }
        return res;
    }
}