package com.santosh.arrays;

public class ImplementRunningSumof1DArray {


    public int[] runningSum(int[] nums) {

        int[] res = new int[nums.length];



        for (int i=0;i<nums.length;i++){

            int sum =0;

            for (int j=0; j<=i;j++){



                sum += nums[j];

            }


        res[i] = sum ;
        }

        return res;
    }
}
