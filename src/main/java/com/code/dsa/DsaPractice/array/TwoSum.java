package com.code.dsa.DsaPractice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
                System.out.println("Pair found: (" + complement + ", " + nums[i] + ")");
                return;
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 8, 1, 4 ,9, 6};
        int target = 9;

        twoSum(nums, target);
//        int[] result = twoSum(nums, target);
//        System.out.println(Arrays.toString(result));
    }
}
