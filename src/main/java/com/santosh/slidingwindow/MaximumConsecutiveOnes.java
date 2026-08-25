package com.santosh.slidingwindow;

public class MaximumConsecutiveOnes {


    public int solve(int[] nums, int k) {


            int left = 0;
            int zeroCount = 0;
            int maxLength = 0;

            for (int right = 0; right < nums.length; right++) {

                // Add the new element to the window
                if (nums[right] == 0) {
                    zeroCount++;
                }

                // Window is invalid if we have more than k zeros
                while (zeroCount > k) {

                    if (nums[left] == 0) {
                        zeroCount--;
                    }

                    left++;
                }

                // Current window is valid
                maxLength = Math.max(
                        maxLength,
                        right - left + 1
                );
            }

            return maxLength;
        }
    }


    /*


    Time:  O(n)
Space: O(1)
     */