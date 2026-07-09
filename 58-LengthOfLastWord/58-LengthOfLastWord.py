# Last updated: 7/9/2026, 3:11:10 PM
class Solution(object):
    def lengthOfLastWord(self, s):
        str= list(s.split())
        return len(str[-1])