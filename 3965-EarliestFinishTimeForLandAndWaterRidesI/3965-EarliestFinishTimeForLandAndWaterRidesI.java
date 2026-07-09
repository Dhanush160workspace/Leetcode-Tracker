// Last updated: 7/9/2026, 3:05:38 PM
public class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        
        int minTotalFinish = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int landFinish = landStartTime[i] + landDuration[i];
            for (int j = 0; j < m; j++) {
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int totalFinish = waterStart + waterDuration[j];
                minTotalFinish = Math.min(minTotalFinish, totalFinish);
            }
        }
        
        for (int j = 0; j < m; j++) {
            int waterFinish = waterStartTime[j] + waterDuration[j];
            for (int i = 0; i < n; i++) {
                int landStart = Math.max(waterFinish, landStartTime[i]);
                int totalFinish = landStart + landDuration[i];
                minTotalFinish = Math.min(minTotalFinish, totalFinish);
            }
        }
        
        return minTotalFinish;
    }
}