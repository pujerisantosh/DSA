package com.santosh;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] solve(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (map.containsKey(need)) {

                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);

        }

       return new int[]{};

    }
}
/*

I always start with the brute-force approach by checking every possible pair using
two nested loops, which gives a time complexity of O(n²) and space complexity of O(1).


 The repeated work is searching for the complement for every element.
 To optimize, I use a HashMap to store previously seen numbers and their indices. For each element, I calculate the complement (target - currentElement) and check if it already exists in the map. Since HashMap lookup is O(1) on average, I can solve the problem in a single pass with O(n) time and O(n) space complexity.
 */