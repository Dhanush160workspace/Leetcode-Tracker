# Last updated: 7/9/2026, 3:11:36 PM
class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        write = 1
        for read in range(1, len(nums)):
            if nums[read] != nums[read - 1]:
                nums[write] = nums[read]
                write += 1

        return write
        
        