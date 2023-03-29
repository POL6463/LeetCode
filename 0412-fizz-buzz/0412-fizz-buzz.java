class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        
        for(int num = 1; num <= n; num++) {
            boolean divBy3 = (num % 3 == 0);
            boolean divBy5 = (num % 5 == 0);
            
            if (divBy3 && divBy5) {
                ans.add("FizzBuzz");
            } else if (divBy3) {
                ans.add("Fizz");
            } else if (divBy5) {
                ans.add("Buzz");
            } else {
                ans.add(Integer.toString(num));
            }
        }
        
        return ans;
    }
}