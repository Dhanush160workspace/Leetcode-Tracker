# Last updated: 7/9/2026, 3:11:34 PM
class Solution(object):
    def removeElement(self, nums, val):
        i=0
        while i<len(nums):
            if nums[i]==val:
                nums.pop(i)
            else:
                i+=1
        