# Last updated: 7/9/2026, 3:11:53 PM
class Solution(object):
    def isPalindrome(self, x):
        x_str = str(x)
        return x_str == x_str[::-1]
    

        