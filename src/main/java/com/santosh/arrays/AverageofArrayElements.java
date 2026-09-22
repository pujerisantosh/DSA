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

        AverageofArrayElements a = new AverageofArrayElements();

        int[] arr = {1,2,3,4,5};


        System.out.println(a.solveint(arr));


    }
}
