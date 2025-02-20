package com.scaler.examples;

public class SortedInsertPosition {

    public int solve(int[] A ,int B){

        int low  = 0;
        int high = A.length-1;


        /*binary search for correct index*/
        if (low <= high){

            int mid  = low + (high-low)/2;

            if(A[mid]== B){
                return  mid;
            } else if (A[mid]<B) {

                low = mid +1;
                
            }
            else {
                high = mid -1;
            }

        }

        return low;

    }

    public static void main(String[] args) {
        SortedInsertPosition test = new SortedInsertPosition();
        int [] A = {1, 3, 5, 6};
        int B = 5;
        int res = test.solve(A,B);
        System.out.println(res);
    }
}
