class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        container = {}
        nl = len(nums)
        for i in range(nl):
            if nums[i] in container:
                return True
            else:
                container[nums[i]] = 1
        
        return False
            
            