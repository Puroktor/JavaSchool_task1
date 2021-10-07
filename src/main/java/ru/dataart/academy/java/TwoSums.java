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
        //Two pointers technique
        int firstPointer = 0, secondPointer = nums.length - 1;
        while (firstPointer < secondPointer) {
            int sum = nums[firstPointer] + nums[secondPointer];
            if (sum > target) {
                secondPointer--;
            } else if (sum < target) {
                firstPointer++;
            } else {
                break;
            }
        }
        return firstPointer < secondPointer
                ? new int[]{nums[firstPointer], nums[secondPointer]}
                : new int[0];
    }
}
