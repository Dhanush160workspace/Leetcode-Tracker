// Last updated: 7/9/2026, 3:11:50 PM
class Solution {
    public int maxArea(int[] height) {
        //Revision1
        int i = 0;
        int j = height.length -1;
        int area = 0;
        while (i<j){
            int h = Math.min(height[i], height[j]);
            int w = (j-i);
            int currarea = (w*h);
            if (currarea > area){
                area = currarea;
            }
            if (height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}