package com.scaler.examples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WaveArray {
    public int[] solve(int[] A){
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i+=2){
            int temp = A[i];
            A[i] = A[i+1];
            A[i+1] = temp ;

        }

        return A;
    }

    public static void main(String[] args) {
        WaveArray wa = new WaveArray();
        int [] A = {1, 2, 3, 4};
        int res[]  = wa.solve(A);
        System.out.println(Arrays.toString(res));
    }
}
