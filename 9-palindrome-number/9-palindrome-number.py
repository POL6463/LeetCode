class Solution:
    def isPalindrome(self, x: int) -> bool:
        #1. check it is negative number
        
        
        if x < 0:
            return False
        #2. change to String
        #3. search left and right get closer
        
        strX = str(x)
        length = len(strX)
        left = 0
        right = length - 1
        while(left <= right):
            if strX[left] != strX[right]:
                return False
            left = left + 1
            right = right - 1
        
        return True
        