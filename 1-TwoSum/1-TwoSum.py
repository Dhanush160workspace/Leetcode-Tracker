# Last updated: 7/9/2026, 3:12:06 PM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_to_index = {}    
        for index, num in enumerate(nums):
            complement = target - num
            if complement in num_to_index:
                return [num_to_index[complement],index]
            num_to_index[num] = index