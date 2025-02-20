package com.scaler.examples;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public  int[] solve(int[] A, int[]B){
        int n = A.length;
        int m = B.length;
        int[] result = new int[n+m];

        int i=0,j=0,k=0;

        // Merge the two arrays A and B

        while(i<n && j<m){
            if(A[i]<=B[j]){
                result[k++] = A[i++];

            }
            else{
                result[k++] = B[j++];
            }

            // If there are any remaining elements in A, add them to result

            while(i<n){
                result[k++] = A[i++];

            }

            while(j<m){
                result[k++] = B[j++];

            }


        }

        return  result;



    }

    public static void main(String[] args) {
        MergeTwoSortedArrays m = new MergeTwoSortedArrays();
        int[] A = {1,2,3};
        int [] B = {4,5,6};
        int[] res= m.solve(A,B);
        System.out.println(Arrays.toString(res));
    }
}
