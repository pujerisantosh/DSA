package com.scaler.examples;

import java.util.Arrays;

public class SmallestNumber {

    public  int[] solve(int[] A){
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        SmallestNumber sm = new SmallestNumber();
        int [] A = {6, 3, 4, 2, 7, 2, 1};
        int [] res = sm.solve(A);

        System.out.println(Arrays.toString(res));

    }


}
