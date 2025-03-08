package com.scaler.examples.stack;

import java.util.Stack;

public class DoubleCharacterTrouble {

    public  String solve(String A ){

        Stack<Character> st = new Stack<>();

        for(char ch : A.toCharArray()){
            if(!st.isEmpty() && st.peek()== ch){
                st.pop();

            }

            else {
                st.push(ch);
            }
        }

        // Convert stack to string

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){

            sb.append(st.pop());

        }

        return  sb.reverse().toString();

    }

    public static void main(String[] args) {
        DoubleCharacterTrouble dc = new DoubleCharacterTrouble();

        String A = "abccbc";

        String res = dc.solve(A);
        System.out.println(res);

    }
}
