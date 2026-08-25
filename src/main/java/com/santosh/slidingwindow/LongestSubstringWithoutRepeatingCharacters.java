package com.santosh.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int solve(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    }



    /*



    Expand → add right character

Invalid → shrink left

Valid → update maxLength


Need frequency?       → HashMap
Need only existence?  → HashSet



I use a Sliding Window with two pointers, left and right. A HashSet stores the characters currently present in the window.
The right pointer expands the window, and whenever a duplicate character is found,
I move left forward and remove characters until the window becomes valid again. After adding the current character,
 I calculate the window length using right - left + 1 and update the maximum length. The time complexity is O(n) and the space complexity is O(k), where k is the number of distinct characters in the window.
     */

