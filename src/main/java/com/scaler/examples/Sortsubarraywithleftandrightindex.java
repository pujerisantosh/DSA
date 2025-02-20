package com.scaler.examples;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class Sortsubarraywithleftandrightindex {
    public int [] solve(int[] A , int left, int right){
        int[] subArray = Arrays.copyOfRange(A,left,right+1);
        Arrays.sort(subArray);
        for(int i=left;i<=right;i++){
            A[i] = subArray[i-left];

        }

        return A;
    }

    public static void main(String[] args) {
        Sortsubarraywithleftandrightindex s = new Sortsubarraywithleftandrightindex();
        int [] A = {59, 11, 8, 91, 49, 44, 8};
        int B = 4;
        int C = 6;
        int [] result = s.solve(A,B,C);
        System.out.println(Arrays.toString(result));
    }


}
