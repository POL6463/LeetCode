class Solution:
    def longestStrChain(self, words: List[str]) -> int:
        if not words:
            return 1
        words.sort(key=len)
        cache = {}
        res = 0
        for word in words:
            longest = 0
            for i in range(len(word)):
                child = word[0:i]+word[i+1:]
                longest = max(longest,cache.get(child,0)+1)
            cache[word] = longest
            res = max(res,longest)
        return res