# Last updated: 7/9/2026, 3:11:09 PM
class Solution:
    def climbStairs(self, n: int) -> int:
        if n==1:
            return 1
        if n==2:
            return 2
        arr = [1]*n 
        arr[1] = 2
        for i in range(2,n):
            arr[i] = arr[i-1] + arr[i-2]
        return arr[-1]
