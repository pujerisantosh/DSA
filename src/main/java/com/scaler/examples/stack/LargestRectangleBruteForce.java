package com.scaler.examples.stack;

public class LargestRectangleBruteForce {

    public int solve(int[] heights){

        int n = heights.length;
        int maxArea = 0;

        for(int i=0;i<n;i++){

            int minHeight = heights[i];

            for(int j=i;j<n;j++){

                 minHeight = Math.min(minHeight , heights[j]);
                 maxArea  = Math.max(maxArea , minHeight * (j-i+1));
            }

        }


        return maxArea;




    }

    public static void main(String[] args) {
        LargestRectangleBruteForce lb = new LargestRectangleBruteForce();

        int [] A = {2};
        int res  = lb.solve(A);

        System.out.println(res);

    }
}
