package Leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Solution : Using Hashmap

*/

// Leetcode
public class TwoSum {

   /* public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {

            int NumToFind = target - nums[i];
            if (map.containsKey(NumToFind) && map.get(NumToFind) != i) {
                return new int[]{i, map.get(NumToFind)};
            }
        }
        throw new IllegalArgumentException("Pair is not found ");
*/
        //==========================================================================================================
        // Reducable Code of above solution


        public static int[] twoSum ( int[] numbers, int target){
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < numbers.length; i++) {
                if (map.containsKey(target - numbers[i])) {
                    result[1] = i;
                    result[0] = map.get(target - numbers[i]);
                    return result;
                }
                map.put(numbers[i], i);
            }
            return result;
        }


        public static void main (String[]args){
            int[] nums = {2, 3, 1, 5, 6, 9};
            int[] result = twoSum(nums, 4);
            System.out.println(Arrays.toString(result));
        }
    }
