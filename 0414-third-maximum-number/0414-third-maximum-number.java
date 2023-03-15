class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> sortedNums = new TreeSet<Integer>();
        
        for (int num : nums) {
            if (sortedNums.contains(num)) {
                continue;
            }
            
            if (sortedNums.size() == 3) {
                if (sortedNums.first() < num) {
                    sortedNums.pollFirst();
                    sortedNums.add(num);
                }
            } else {
                sortedNums.add(num);
            }
        }
        
        if (sortedNums.size() == 3) {
            return sortedNums.first();
        }
        
        return sortedNums.last();
    }
}