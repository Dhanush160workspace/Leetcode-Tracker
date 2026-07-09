// Last updated: 7/9/2026, 3:08:52 PM
import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, mid, h)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean canFinish(int[] piles, int speed, int h) {
        long totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
        }

        return totalHours <= h;
    }
}