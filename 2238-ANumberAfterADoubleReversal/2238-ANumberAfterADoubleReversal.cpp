// Last updated: 7/9/2026, 3:06:46 PM
class Solution {
public:
    bool isSameAfterReversals(int num) {
            if (num == 0) return true; 
            return num % 10  != 0;
    }
};