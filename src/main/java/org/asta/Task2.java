package org.asta;

import java.util.HashMap;

/**
 * @author Asta
 */
public class Task2 {

//     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//     You may assume that each input would have exactly one solution, and you may not use the same element twice.
//     You can return the answer in any order.

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] result1 = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println("Output: " + result1[0] + ", " + result1[1]);

        int[] result2 = twoSum(new int[] { 3, 2, 4 }, 6);
        System.out.println("Output: " + result2[0] + ", " + result2[1]);

        int[] result3 = twoSum(new int[] { 3, 3 }, 6);
        System.out.println("Output: " + result3[0] + ", " + result3[1]);
    }
}
