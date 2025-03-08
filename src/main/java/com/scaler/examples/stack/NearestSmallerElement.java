package com.scaler.examples.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {

    public int[] solve(int[] A ){

        int n = A.length;

        int [] arr =new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            // Pop elements from stack that are >= A[i]
           while(!st.isEmpty() && st.peek() >= A[i]){

               st.pop();
           }

            // Assign the nearest smaller element

            arr[i] = st.isEmpty() ? -1 : st.peek();

            // Push current element onto stack

            st.push(A[i]);





        }

        return  arr ;

    }


    public static void main(String[] args) {

        NearestSmallerElement ns = new NearestSmallerElement();

        int [] arr = {4, 5, 2, 10, 8};

        int [] res = ns.solve(arr);

        System.out.println(Arrays.toString(res));
    }
}
