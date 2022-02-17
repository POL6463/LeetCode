class Solution:
    def minSteps(self, s: str, t: str) -> int:
        sarr = [0] * 26
        tarr = [0] * 26
        for i in range(len(s)):
            sarr[ord(s[i]) - ord("a")] += 1
            tarr[ord(t[i]) - ord("a")] += 1
        
        count = 0
        for i in range(26):
            if sarr[i] > tarr[i]:
                count += (sarr[i] - tarr[i])
        
        return count