class Solution:
    def twoSum(self, nums: List[int], target: int):
        i = 0
        while nums:
            a = nums.pop(0)
            print(a)
            b = target - a
            print(b)
            if b in nums:
                j = nums.index(b) + (i + 1)
                return [i, j]
            i = i + 1