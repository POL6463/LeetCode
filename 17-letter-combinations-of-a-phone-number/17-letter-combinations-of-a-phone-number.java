class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc"); map.put('3', "def");
        map.put('4', "ghi"); map.put('5', "jkl");
        map.put('6', "mno"); map.put('7', "pqrs");
        map.put('8', "tuv"); map.put('9', "wxyz");
        backtracking(digits, result, map, "", 0);
        return result;
        
    }
    private void backtracking(String digits, List<String> result, Map<Character, String> map, String currStr, int i){
        if (currStr.length() == digits.length()){
            result.add(currStr);
            return;
        }
        for (char c: map.get(digits.charAt(i)).toCharArray())
            backtracking(digits, result, map, currStr+c, i+1);
    }
}