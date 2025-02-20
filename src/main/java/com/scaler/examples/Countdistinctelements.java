package com.scaler.examples;

import java.util.HashSet;

public class Countdistinctelements {

    public  int solve(int[] A ){

        HashSet<Integer> H = new HashSet<>();

        for(int num : A ){
            H.add(num);
        }

        return H.size();


    }


    public static void main(String[] args) {
        Countdistinctelements c= new Countdistinctelements();
        int [] A = {3, 3, 3, 9, 0, 1, 0};
        int res = c.solve(A);

        System.out.println(res);
    }
}
