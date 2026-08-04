package com.santosh.arrays;

public class AverageofArrayElements {

    public int solveint(int[] arr){


        int sum = 0;

        for (int i=0;i<arr.length;i++) {

            sum += arr[i];

        }
            int average = sum/arr.length;



            return average;
        }







    static void main(String[] args) {

    }
}
