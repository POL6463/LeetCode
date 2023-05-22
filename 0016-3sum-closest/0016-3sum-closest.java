class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len && diff != 0; ++i) {
            int low = i + 1;
            int high = len - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    ++low;
                } else {
                    --high;
                }
            }
        }
        return target - diff;
    }
}