package com.scaler.examples;

import java.util.HashSet;

public class Subarraywith0sum {
    public int solve(int[] A) {
        HashSet<Integer> sum = new HashSet<>();
        int currentSum = 0;
        for (int num : A) {
            currentSum += num;


            if (currentSum == 0 || sum.contains(currentSum)) {

                return 1;


            }

            sum.add(currentSum);
        }

        return 0;
    }


    public static void main(String[] args) {
        Subarraywith0sum s = new Subarraywith0sum();
        int [] A =  {1,-1,3};
        int res = s.solve(A);
        System.out.println(res);
    }
}