class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxWater = 0
        
        while l < r:
            water = (r - l) * min(height[r], height[l])
            maxWater = max(maxWater, water)
            if height[l] > height[r]:
                r -= 1
            else:
                l += 1
            
        return maxWater