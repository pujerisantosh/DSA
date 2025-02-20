package com.scaler.examples;

public class countPairsDivisibleByB {
    public  int countPairs(int[] A, int B){
        int n = A.length;
        int [] freq = new int[B];
        int count =0;

        for(int i=0;i<n;i++){
            int res = A[i] % B;
            int pair ;
            if(res==0){
                pair = 0;
            }
            else {
                pair = B-res;
            }
            count += freq[pair];
            freq[res]++;
        }

        return  count%1000000007;
    }

    public static void main(String[] args) {
        countPairsDivisibleByB c = new countPairsDivisibleByB();
         int [] A = {1, 2, 3, 4, 5};
         int B = 2;

         int  res = c.countPairs(A,B);

        System.out.println(res);

    }

}
