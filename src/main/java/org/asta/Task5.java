package org.asta;

/**
 * @author Asta
 */
public class Task5 {

//    Given a sorted array of distinct integers and a target value, return the index if the target is found.
//    If not, return the index where it would be if it were inserted in order.
//    You must write an algorithm with O(log n)  runtime complexity.

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 5));
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 2));
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }
}
