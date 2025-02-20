package com.scaler.examples;

import java.sql.SQLOutput;
import java.util.HashSet;

public class findFirstRepeatingElement {

    public int solve(int[] A) {
        HashSet<Integer> has = new HashSet<>();

        for (int num : A) {
            if (has.contains(num)) {
                return num;
            }

            has.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {
        findFirstRepeatingElement element = new findFirstRepeatingElement();
        int [] A = {1,2,3,4,5,6,2};
        int res = element.solve(A);

        System.out.println(res);

    }
}