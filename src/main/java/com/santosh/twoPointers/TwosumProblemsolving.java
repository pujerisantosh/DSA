package com.santosh.twoPointers;

import java.util.HashMap;
import java.util.Map;

public class TwosumProblemsolving {


    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){

            int need = target - nums[i];

            if (map.containsKey(need)){

                return new int[]{map.get(nums[i]), i};
            }


            map.put(nums[i], i);
        }


        return new int[]{};

    }
}
