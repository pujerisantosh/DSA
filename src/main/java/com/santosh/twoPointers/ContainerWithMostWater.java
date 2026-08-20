package com.santosh.twoPointers;

public class ContainerWithMostWater {


    public int maxArea(int[] height) {


        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;



        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, width * h);

            // Move the shorter wall inward
            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxWater;
    }




    }



    /*


    Complexity

Brute force:

Time:  O(n²)
Space: O(1)


public int maxArea(int[] height) {

    int maxArea = 0;

    for (int i = 0; i < height.length; i++) {

        for (int j = i + 1; j < height.length; j++) {

            int width = j - i;
            int minHeight = Math.min(height[i], height[j]);

            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);
        }
    }

    return maxArea;
}

Two Pointers:

Time:  O(n)
Space: O(1)


The brute-force approach checks every pair, giving O(n²) time and O(1) space.
The optimized Two Pointer approach starts with the maximum width and moves the shorter boundary inward because it limits the container's height.
Each pointer moves at most n times, giving O(n) time and O(1) space."




     */



