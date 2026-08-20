package com.santosh.twoPointers;

public class InputArrayIsSortedTwoSum {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{};
    }
}


/*


Brute force:

Time:  O(n²)
Space: O(1)

Two Pointer:

Time:  O(n)
Space: O(1)

Why optimized?

Because the array is sorted,
every pointer movement eliminates impossible candidates.
 Each pointer moves only toward the other pointer,
 so the total work is linear.




  because the array is sorted and the current sum is greater than the target, the right-side value is too large.
 Since the left pointer is already at the smallest available value, increasing the left value would only make the sum larger.
  Therefore, we safely move the right pointer left."



  Condition	Movement	Reason
sum == target	return	Found the pair
sum < target	left++	Need a larger value
sum > target	right--	Need a smaller value
 */