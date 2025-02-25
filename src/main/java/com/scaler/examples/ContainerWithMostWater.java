package com.scaler.examples;

public class ContainerWithMostWater {
    public  int solve(int [] A){
        int left =0;
        int right = A.length-1;
        int maxArea =0;

        while (left < right){
            int hieght = Math.min(A[left] , A[right]);
            int width = right-left;
            maxArea = Math.max(maxArea, hieght*width);


            if(A[left] < A[right]){
                left++;
            }
            else {
                right--;
            }
        }


        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        int [] A = {1, 5, 4, 3} ;
        int res  = c.solve(A);
        System.out.println(res);
    }
}
