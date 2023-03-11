class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> resList = new ArrayList<>();
        
        for (int i : nums) {
            if (!resList.contains(i)) {
                resList.add(i);
            } else {
                resList.remove(Integer.valueOf(i));
            }
        }
        return resList.get(0);
    }
}