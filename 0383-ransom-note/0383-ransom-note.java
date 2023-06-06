class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] strToChar = ransomNote.toCharArray();
        for(int i = 0; i < strToChar.length; i++){
            String curr = String.valueOf(strToChar[i]);
            if(magazine.contains(curr)){
                magazine = magazine.replaceFirst(curr, " ");
            } else{
                return false;
            }
        }
        return true;
        
    }
}