package com.scaler.examples.stack;

import java.util.Stack;

public class Passinggame {

    public int solve(int A , int B , int [] C){
        Stack<Integer> st = new Stack<>();

          int n = C.length;

          for(int i=0;i<n;i++){
              if(C[i] != 0){
                  st.push(C[i]);
              }
              else {
                  if(!st.isEmpty()){
                      st.pop();
                  }
              }
          }

          if(st.size()==0){
              return  B;
          }

          return st.peek();

    }

    public static void main(String[] args) {
        Passinggame ps = new Passinggame();

        int A = 10;
        int B = 23;
        int [] C ={86, 63, 60, 0, 47, 0, 99, 9, 0, 0} ;
        int res = ps.solve(A,B,C);

        System.out.println(res);
    }




}
