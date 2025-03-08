package com.scaler.examples.stack;

import java.util.Stack;

public class BalancedParenthesis {

    public  int solve(String A) {

        Stack<Character> st = new Stack<>();

        for(char ch : A.toCharArray()){

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if (ch == ')' || ch == '}'|| ch == ']') {
                if(st.isEmpty()){
                    return  0;
                }

                int top = st.pop();
                if(!isMissmatched(top,ch)){
                    return 0;
                }

            }
        }

        return  st.isEmpty() ? 1:0;

    }

    private boolean isMissmatched(int top, char ch) {

        return (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch== ']');
    }

    public static void main(String[] args) {
        BalancedParenthesis bp = new BalancedParenthesis();
        String A = "(){";
        int res = bp.solve(A);
        System.out.println(res);
    }


}