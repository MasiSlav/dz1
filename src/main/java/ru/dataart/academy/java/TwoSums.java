package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        {
            int[] vsp = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length - 1; j > 0; j--) {
                    if (nums[i] + nums[j] == target) {
                        vsp[0] = nums[i];
                        vsp[1] = nums[j];
                        return vsp;
                    }
                }
            }
            return new int[]{};
        }
    }
}
