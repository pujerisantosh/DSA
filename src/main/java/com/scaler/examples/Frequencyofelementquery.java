package com.scaler.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Frequencyofelementquery {
    public List<Integer> solve(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count the frequency of each learner in A[]

        for (int lerner : A) {
            map.put(lerner, map.getOrDefault(lerner, 0) + 1);
        }

        // For each learner in B[], check its frequency in the map
        List<Integer> result = new ArrayList<>();
        for (int learner : B) {
            result.add(map.getOrDefault(learner, 0));
        }


        return result;
    }


    public static void main(String[] args) {
        Frequencyofelementquery f = new Frequencyofelementquery();
        int[] A = {1, 2, 1, 1};
        int[] B = {1,2};
        List<Integer> res = f.solve( A, B);

        System.out.println(res);
    }

}

