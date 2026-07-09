// Last updated: 7/9/2026, 3:09:19 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        Arrays.fill(res, -1);
        
        for (int x=0; x < nums.length*2; x++){
            int ele = nums[x%nums.length];
            while (!s.empty() && ele>nums[s.peek()]){
                res[s.pop()] = ele;
            }
            s.push(x%nums.length);
        }
        return res;
    }
}