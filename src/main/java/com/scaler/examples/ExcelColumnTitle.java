package com.scaler.examples;

public class ExcelColumnTitle {
    public String solve(int A){
        String res = "";
        while (A>0){
            res = (char) ((A-1)%26 + 'A') + res ;
            A= (A-1)/26;
        }

        return  res;
    }

    public static void main(String[] args) {
        ExcelColumnTitle ex = new ExcelColumnTitle();
        int A = 19;
        String res = ex.solve(A);

        System.out.println(res);
    }
}
