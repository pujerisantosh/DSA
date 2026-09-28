package com.santosh.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class TestMysubarrcode {


    public int  findSubarray(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();

        int currentSum =0;

        int count =0;

        map.put(0,1);


        for (int i=0;i<nums.length; i++){

            currentSum += nums[i];

            int needed = target - currentSum;


            count += map.getOrDefault(needed,0);
            map.put(currentSum, map.getOrDefault(currentSum,0)+1);
        }

        return count ;

    }
}
