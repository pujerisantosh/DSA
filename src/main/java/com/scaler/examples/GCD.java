package com.scaler.examples;

public class GCD {

    public  int gcd(int a,int b){
        int rem = b%a;

        if(rem!= 0){
            b=a;
            a= rem;
            rem = b%a;


        }

        return a;
    }

    public static void main(String[] args) {
        GCD  g = new GCD();
        int a= 6;
        int b= 7;
        int res = g.gcd(a,b);

        System.out.println(res);
    }
}
