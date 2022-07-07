class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int currentSIndex = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(currentSIndex) == t.charAt(i)){
                currentSIndex++;
            }
            if(currentSIndex == s.length()) {
                return true;
            }
        }
        return false;
    }
}