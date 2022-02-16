class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        
        sarr = [0] * 128
        tarr = [0] * 128
        for i in range(len(s)):
            sarr[ord(s[i])] += 1
            tarr[ord(t[i])] += 1
        
        if sarr == tarr:
            return True
        else:
            False