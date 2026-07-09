// Last updated: 7/9/2026, 3:06:23 PM
class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        // int ntime = arrivalTime+delayedTime;
        // if (ntime<24) return ntime;
        // else return ntime%24;
        return (a+d)%24;
    }
}