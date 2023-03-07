class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        
        for (int n = len - 1; n >= 0; --n) {
            if (digits[n] == 9) {
                digits[n] = 0;
            }
            
            else {
                digits[n]++;
                return digits;
            }
        }
        
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}