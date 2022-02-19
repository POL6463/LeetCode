class Solution:
    def hammingWeight(self, n: int) -> int:
        counter = 0
        while n >= 1:
            if n % 2 == 1:
                counter += 1
                n //= 2
            else:
                n //= 2
                
        return counter