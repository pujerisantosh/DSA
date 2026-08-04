package com.santosh.arrays;

public class findMaximum {

public int findMax(int[] arr){

    int max = arr[0];



    for (int i=1;i<arr.length;i++){

        if (arr[i] > max){
            max = arr[i];
        }
    }

    return  max ;

}

    static void main(String[] args) {

    int[] arr = {1,2,3,4,5,7,8,9,10};

    findMaximum max = new findMaximum();

        System.out.println(max.findMax(arr));
    }

}
