package com.scaler.examples.trees;

import java.util.ArrayList;
import java.util.List;

public class ListtoArray {
    public static void main(String[] args) {

        // create list
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // convert list to array

        String [] arr = list.toArray(new String[0]);

        System.out.println("array elemenst:");
        for(String result : arr){
            System.out.println(result);
        }
    }
}
