class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        res = []
        numbers.sort()
        
        i = 0
        right = len(numbers) - 1
        while i < right:
            twoSum = numbers[i] + numbers[right]
            if twoSum > target:
                right -= 1
            elif twoSum < target:
                i += 1
            else:
                
                return [i + 1, right + 1]
                
        return res
                    
            