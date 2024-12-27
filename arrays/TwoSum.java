import java.util.HashMap;

class TwoSum {
    /**
     * https://leetcode.com/problems/two-sum/description/
     * 
     * solution o(n):
     * iterate through the nums array only once.
     * as we go through, store each number and its index in a hashmap,
     * and each time we iterate, check if the map contains the necessary 
     * number to reach the target sum
     * 
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int thisNum = nums[i];
            if (numMap.containsKey((target - thisNum))) {
                return new int[]{numMap.get(target - thisNum), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}