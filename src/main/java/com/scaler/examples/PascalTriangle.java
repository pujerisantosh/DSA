package com.scaler.examples;

import java.util.Arrays;

import static javax.print.attribute.standard.MediaSizeName.A;

public class PascalTriangle {
    public int [][]  solve(int A){
        int [][] arr = new int[A][A];
        for(int i=0;i<A;i++){
            for(int j=0;j<=i;j++){

              if(i==j){
                  arr[i][j] = 1;
              }
              else if(j==0) {
                  arr[i][j] = 1;

              }
              else {
                  arr[i][j] = arr[i-1][j] + arr[i-1][j];
              }
            }


        }
return  arr;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
int[][] res = pt.solve(A.getValue());
        System.out.println(Arrays.deepToString(res));
}
}