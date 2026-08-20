package com.santosh.twoPointers;

import java.util.Arrays;

public class reverseStringsolving {

    public void reverseString(char[] s){


        int left =0;

        int right = s.length-1;

        while (left < right){

            char temp = s[left];
            s[left] = s[right];

            s[right] = temp;

            left++;
            right--;
        }


    }


    static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseStringsolving obj = new reverseStringsolving();

        obj.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}
