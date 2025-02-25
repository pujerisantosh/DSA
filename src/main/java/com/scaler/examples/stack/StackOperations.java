package com.scaler.examples.stack;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // 1.push insertion
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // 2.peek and pop

        int data = st.peek();
        System.out.println(data);

        //3.pop
        st.pop();

        int data1  = st.peek();
        System.out.println(data1);


        st.pop();


        boolean res = st.isEmpty();

        System.out.println(res);


        st.pop();

        st.pop();

       boolean res2 = st.isEmpty();
        System.out.println(res2);



    }

}
