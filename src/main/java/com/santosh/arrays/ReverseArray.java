package com.santosh.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr){

        for (int i=arr.length-1;i>=0;i--){


            System.out.print(arr[i] + " ");
        }



    }


   public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        ReverseArray rev = new ReverseArray();
        rev.reverseArray(arr);

    }
}
