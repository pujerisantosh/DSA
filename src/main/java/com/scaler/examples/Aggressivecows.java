package com.scaler.examples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Aggressivecows {

// function to check we can place B cows at leastmin distance
        public static boolean canPlaceCow(int[] stall , int cows, int minDist){

            int count =1;
            int lastpostion = stall[0];

            for(int i=1;i<stall.length;i++){
                if(stall[i]-lastpostion >= minDist){
                    count++;
                    lastpostion = stall[i];
                    if(count==cows){
                        return true;
                    }
                }
            }

            return false;
        }

        //function to find the minimun distance

    public static int minDist(int[] stall, int cows){
        Arrays.sort(stall);
            int low = 0;
            int high = stall[stall.length-1] - stall[0];

            int best = 0;

            while (low <= high){
                int mid = (low+high)/2;

                if(canPlaceCow(stall,cows,mid)){
                    best = mid;
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }

            return best;

    }

    public static void main(String[] args) {
        Aggressivecows a = new Aggressivecows();
        int [] A = {1, 2, 3, 4, 5};
        int B = 3;

        int res = a.minDist(A,B);
        System.out.println(res);
    }
}