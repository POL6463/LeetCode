class Solution:
    def minTimeToType(self, word: str) -> int:
        ss = 0
        curr = "a"
        diff = abs(ord(curr) - ord(word[0]))
        if diff >13:
            diff = 26-diff
        ss += diff%26
        
        for i in range(1,len(word)):
            diff = abs(ord(word[i]) - ord((word[i-1])))
            if diff >13:
                diff = 26-diff
            ss += diff%26
        return ss + len(word)