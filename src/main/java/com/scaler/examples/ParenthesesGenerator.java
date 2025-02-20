package com.scaler.examples;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {
    // Helper function to generate all valid parentheses combinations

    public void generateParentheses(int open, int close, int A, String current, List<String> result){

        // If the current string has reached a valid length (2 * A)
       if(current.length() == 2*A){
           result.add(current);
           return;
       }

        // We can add an opening parenthesis if we haven't reached the limit
        if(open < A){
            generateParentheses(open+1, close, A, current + "(",result);

        }

        // We can add a closing parenthesis if there are more open parentheses than close ones

       if(close< open){
           generateParentheses(open, close+1, A, current + ")", result);
       }
    }

    public List<String> solve(int A){
        List<String> result  = new ArrayList<>();
        generateParentheses(0,0,A,"", result);
        return  result;


    }

    public static void main(String[] args) {
        ParenthesesGenerator gen = new ParenthesesGenerator();
        int A = 3;
        List<String> res = gen.solve(A);
        System.out.println(res);
    }


}
