package com.scaler.examples;

import com.scaler.Main;

import java.util.Arrays;

public class CountSort {

    public  int[]  solve(int[] A) {

        /*int min = Integer.MAX_VALUE;*/
        int max = Integer.MIN_VALUE;
        int n = A.length;
        for(int i=0;i<n;i++){
            max = Math.max(max,A[i]);
        }

        /*create frequency */

        int [] freq = new int[max+1];
        for(int i=0;i<n;i++){
            freq[A[i]]++;
        }

        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<freq[i];j++){
                A[k] = i;
                k++;
            }
        }

        return A;


    }

    public static void main(String[] args) {
        CountSort c = new CountSort();
        int[] A = {1,3,1,2};

        int [] res  = c.solve(A);
        System.out.println(Arrays.toString(res));
    }
}
