class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int counter = 0;
        for (int i: nums){
            if (counter == 0) res[counter] = i;
            else{
                res[counter] = res[counter - 1] + i;
            }
            counter++;
        }
        return res;
    }
}