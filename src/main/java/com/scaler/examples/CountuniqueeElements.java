package com.scaler.examples;

import java.util.HashMap;
import java.util.HashSet;

public class CountuniqueeElements {

    public  int solve(int[] A){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : A){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        int count =0;
        for(int freq : frequencyMap.values()){
            if(freq ==1){
                count++;
            }
        }

        return  count;

    }

    public static void main(String[] args) {
        CountuniqueeElements obj = new CountuniqueeElements();
        int [] A = {3, 3, 3, 9, 0, 1, 0};

        int res = obj.solve(A);
        System.out.println(res);
    }
}
