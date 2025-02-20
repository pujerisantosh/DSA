package com.scaler.examples;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TowerofHanoi {
    // Recursive method to solve the Tower of Hanoi
    public void moveDisk(int A, int start , int end, int aux, List<int[]> moves){
        //if A==1;
         if(A==1){
             moves.add(new int[]{1,start,end});
         }
    else {
    moveDisk(A-1, start, end, aux, moves);
    moves.add(new int[] {A,start,end});
    moveDisk(A-1, start,end, aux, moves);
    }

    }


    public  int [][] solve(int A){
        List<int[]> moves = new ArrayList<>();



        moveDisk(A, 1,3,2, moves);

        int [] [] result = new int[moves.size()][3];
        for(int i=0;i<moves.size();i++){
            result[i] = moves.get(i);
        }

        return  result;


    }

    public  static  void main(String[] args) {
        TowerofHanoi t1 = new TowerofHanoi();
        int a = 2;
        int[][] res = t1.solve(a);
        for (int[] moves : res) {
            System.out.println(Arrays.toString(moves));
        }

    }
}
