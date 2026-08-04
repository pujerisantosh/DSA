package com.santosh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {



    public int[] nextGreaterElement(int[] nums){

        int n = nums.length;

        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        for (int i=0; i< n * 2; i++){

            int index = i%n;

            while (!st.isEmpty() && st.peek() > nums[index]){

                ans[st.pop()] = nums[index];


            }



            if (i < n){

                st.push(index);
            }
        }


        return ans;

    }




    /*

    I use a monotonic decreasing stack that stores indices.
    The stack keeps track of elements whose next greater element hasn't been found yet.
    As I traverse the array, whenever I find a larger element, I pop indices from the stack and update their answers. Since the array is circular, I iterate twice using i % n to simulate wrapping around. Although the loop runs 2n times, each index is pushed and popped at most once,
     so the overall time complexity is O(n) with O(n) extra space.
     */
}
