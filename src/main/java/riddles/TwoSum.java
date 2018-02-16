package riddles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {


// hashMap quick ref:https://www.youtube.com/watch?v=-JOSjIan2g0
//https://docs.oracle.com/javase/7/docs/api/java/util/Map.html
// https://leetcode.com/problems/two-sum/solution/

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */


    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (i == j) j++;
                else if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement)!= i)
                return new int[] {map.get(complement), i};
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumOnePassHash(int[] nums, int target){

        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }




    public static void main(String[] args) {

        int[] nums = {3,2,4};
        System.out.println(Arrays.toString((twoSum(nums, 6))));

        twoSumOnePassHash(nums, 6);

    }





}
