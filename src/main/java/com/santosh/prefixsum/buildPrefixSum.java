package com.santosh.prefixsum;

public class buildPrefixSum {

    public int[] buildPrefixSum(int[] nums){


        int[] prefixSum = new int[nums.length+1];

        for (int i=0; i<=nums.length;i++){

            prefixSum[i+1] = prefixSum[i] + nums[i];
        }



        return prefixSum;


    }



}
