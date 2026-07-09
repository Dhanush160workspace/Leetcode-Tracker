# Last updated: 7/9/2026, 3:07:44 PM
class Solution(object):
    def findLucky(self, arr):
        from collections import Counter
        freq=Counter(arr)
        lucky_num=[]
        for num, count in freq.items():
            if num == count:
                lucky_num.append(num)
        if lucky_num:
            return max(lucky_num)
        else:
            return -1
        
        