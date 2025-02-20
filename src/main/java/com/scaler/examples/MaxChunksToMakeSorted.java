package com.scaler.examples;

public class MaxChunksToMakeSorted {
    public int solve(int[] A){
        int maxSofar = 0;
        int chunksCount =0;
        for(int i=0;i<A.length;i++){
            maxSofar = Math.max(maxSofar,A[i]);
            if(maxSofar == i){
                chunksCount++;
            }
        }

        return chunksCount;
    }

    public static void main(String[] args) {
        MaxChunksToMakeSorted obj = new MaxChunksToMakeSorted();
        int [] A = {1, 2, 3, 4, 0};
        int res  = obj.solve(A);
        System.out.println(res);
    }
}
