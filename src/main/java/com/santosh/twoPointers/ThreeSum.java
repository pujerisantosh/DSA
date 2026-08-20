package com.santosh.twoPointers;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);


        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first values


            if (i > 0 && nums[i] == nums[i - 1]) {

                continue;
            }


            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {


                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {

                    res.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }

            }


        }

        return res;
    }


}

    /*

    for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {

            if (nums[i] + nums[j] + nums[k] == 0) {
                // triplet found
            }
        }
    }
}



Brute force = O(n³) time, O(1) auxiliary space.




optimal :

Time:  O(n²)
Space: O(1) auxiliary

The returned result itself requires space for the triplets.

🔑 The 3Sum pattern

Remember this structure:

Sort
  ↓
Fix i
  ↓
left = i + 1
right = n - 1
  ↓
sum < 0 → left++
sum > 0 → right--
sum == 0 → store + move both
  ↓
Skip duplicates




    Complexity

    Sorting:

    O(n log n)

    For each i, two pointers:

    O(n)

    Across all i:

    O(n²)

    Therefore:

    Time:  O(n²)
    Space: O(1) auxiliary
*/
