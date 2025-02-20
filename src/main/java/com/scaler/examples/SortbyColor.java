package com.scaler.examples;

import java.util.Arrays;

import static java.util.Collections.swap;

public class SortbyColor {
    public int[] sortColors(int[] A) {
        int low = 0;
        int mid = 0;
        int high = A.length - 1;

        while (mid <= high) {
            if (A[mid] == 0) {
                // Swap A[low] and A[mid], then increment both
                swap(A, low, mid);
                low++;
                mid++;
            } else if (A[mid] == 1) {
                // Move mid pointer forward
                mid++;
            } else {
                // Swap A[mid] and A[high], then decrement high
                swap(A, mid, high);
                high--;
            }
        }

        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        SortbyColor s = new SortbyColor();
        int[] A = {0, 1, 2, 0, 1, 2};
        int [] res  = s.sortColors(A);
        System.out.println(Arrays.toString(res));
    }


}