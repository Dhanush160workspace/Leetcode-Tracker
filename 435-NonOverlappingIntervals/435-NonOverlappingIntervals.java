// Last updated: 7/9/2026, 3:09:28 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int n = intervals.length;
        int m = intervals[0][1];
        int count = 0;
        for (int i=1; i<n; i++){
            if (intervals[i][0] < m){
                count = count + 1;
            } else {
                m = intervals[i][1];
            }
        }
        return count;
    }
}