// Last updated: 7/9/2026, 3:09:01 PM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> s = new Stack<>();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            while (!s.empty() && temp[i] > temp[s.peek()]){
                arr[s.peek()] = i - s.peek();
                s.pop();
            }
            s.push(i);
        }
        return arr;
    }
}