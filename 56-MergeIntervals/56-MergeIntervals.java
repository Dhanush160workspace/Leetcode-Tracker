// Last updated: 7/9/2026, 3:11:12 PM
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Base case
        if (intervals.length <= 1) {
            return intervals;
        }

        // 1. Crucial Fix: Sort the intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        // 2. Add the very first interval to seed the list
        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            // Get the last interval we added to our list
            int[] lastAdded = list.get(list.size() - 1);
            
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            // 3. Compare last added interval's end time with current interval's start time
            if (lastAdded[1] >= currentStart) {
                // There is an overlap, merge them by updating the end time
                lastAdded[1] = Math.max(lastAdded[1], currentEnd);
            } else {
                // No overlap, it's safe to add the current interval as a new entry
                list.add(intervals[i]);
            }
        }

        // Your conversion logic here is perfectly correct!
        return list.toArray(new int[list.size()][]);
    }
}