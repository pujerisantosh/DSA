package com.santosh.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsKSolve {

    public int sumSubarray(int[] nums, int target){


        Map<Integer, Integer> map = new HashMap<>();


        int currentSum  =0;

        int count =0;


        map.put(0, 1);

        for(int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            int needed = currentSum - target;

            count += map.getOrDefault(needed, 0);

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }


return count;



    }

    static void main(String[] args) {

        SubarraySumEqualsKSolve sb = new SubarraySumEqualsKSolve();

        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;

        System.out.println(sb.sumSubarray(nums, target));
    }


    /*

     * **Pattern:** Prefix Sum + HashMap — use for counting contiguous subarrays with a target sum `k`, including arrays with negative numbers.
     * **Core idea:** `currentSum - previousSum = k` → therefore `previousSum = currentSum - k`; check how many times that prefix sum occurred.
     * **`map.put(0, 1)`:** Represents the empty prefix before the array starts, so subarrays beginning at index `0` are counted.
     * **Complexity:** Time **O(n)** average, Space **O(n)**.
     * **Interview answer:** “I maintain prefix-sum frequencies in a HashMap, look for `currentSum - k` at every element, add its frequency to the count, then store the current prefix sum.”


needed = requiredPrefixSum
     */
}
