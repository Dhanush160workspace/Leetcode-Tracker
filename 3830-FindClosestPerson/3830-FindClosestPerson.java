// Last updated: 7/9/2026, 3:05:47 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int xres = Math.abs(z - x);
        int yres = Math.abs(z - y);
        if (xres == yres) return 0;
        else if (xres>yres) return 2;
        else return 1;
    }
}