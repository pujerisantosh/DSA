package com.santosh.prefixsum;

import static java.lang.Long.sum;

public class RangeSumQuery {


    public static int rangeSum(int[] nums, int left, int right) {

        int[] prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }


        return prefix[right + 1] - prefix[left];


    }


}

/*

Prefix Sum precomputes cumulative sums,
allowing range-sum queries in O(1) instead of recalculating
each range.

Complexity
Build Prefix Sum → O(n)
Each Range Query → O(1)
Space             → O(n)
 */