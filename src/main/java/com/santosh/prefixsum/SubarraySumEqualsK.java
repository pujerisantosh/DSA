package com.santosh.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public int subArraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;
        int count = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            int needed = currentSum - k;

            count += map.getOrDefault(needed, 0);

            map.put(
                    currentSum,
                    map.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }
}



/*

I use Prefix Sum with a HashMap to count subarrays
 whose sum equals K. I maintain the frequency of previously seen prefix sums. For each current prefix sum, I check currentSum - k in the map. If it exists, its frequency tells me how many subarrays
ending at the current index have sum K.


Time  → O(n)
Space → O(n)
 */