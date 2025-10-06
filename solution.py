class Solution:
    def shuffle(self, nums, n):
        ret = []
        for i in range(n):
            ret.append(nums[i])
            ret.append(nums[i + n])
        
        return(ret)
