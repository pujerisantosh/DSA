package com.santosh.slidingwindow;

public class MinimumSizeSubarraySum {


    public int solve ( int target, int[] nums){

            int left = 0;
            int sum = 0;
            int minLength = Integer.MAX_VALUE;

            for (int right = 0; right < nums.length; right++) {

                // Expand the window
                sum += nums[right];

                // Shrink while the window is valid
                while (sum >= target) {

                    // Current window is valid
                    minLength = Math.min(
                            minLength,
                            right - left + 1
                    );

                    // Remove the left element
                    sum -= nums[left];
                    left++;
                }
            }

            return minLength == Integer.MAX_VALUE ? 0 : minLength;
        }
    }


