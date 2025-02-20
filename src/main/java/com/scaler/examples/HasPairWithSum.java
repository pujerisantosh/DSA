package com.scaler.examples;

import java.util.HashSet;

public class HasPairWithSum {
    public  int solve(int A, int [] B){
        HashSet<Integer> set = new HashSet<>();
        for(int num : B){
            if(set.contains(A-num)){
                return 1;
            }

            set.add(num);
        }

        return 0;
    }

    public static void main(String[] args) {
        HasPairWithSum obj = new HasPairWithSum();
        int A = 21;
        int [] B = {9, 10, 7, 10, 9, 1, 5, 1, 5};

        int res = obj.solve(A, B);
        System.out.println(res);
    }
}
