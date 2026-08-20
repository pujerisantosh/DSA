package com.santosh.twoPointers;

public class reverseString {


    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;


        while (left < right){

            char temp = s[left];
            s[left] = s[right];

            s[right] = temp;


            left++;
            right--;
        }

    }
}
/*

Pattern: Two Pointers — opposite-direction pointers.

Brute Force:
Create a new array/string and copy characters in reverse order.

Time: O(n)
Space: O(n) — extra array/string is required.

Optimized:
Use two pointers, left = 0 and right = n - 1, and swap the characters while moving both pointers toward the center.

Time: O(n)
Space: O(1)

Why optimized?
Each character is processed at most once, and we modify the input in-place, so there is no additional array/string.

One-line interview answer

"The brute-force approach takes O(n) time and O(n)
extra space because we create another array/string.
 The optimized Two Pointer approach takes O(n) time and O(1)
 space because we swap elements in-place,
 and each pointer traverses only toward the center."
 */