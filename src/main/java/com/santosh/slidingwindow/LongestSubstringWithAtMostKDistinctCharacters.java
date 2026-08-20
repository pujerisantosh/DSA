package com.santosh.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {

    public static int longestSubstring(String s, int k) {


        Map<Character, Integer> frequency = new HashMap<>();


        int left = 0;

      int   maxLength =0 ;

        for (int right = 0; right < s.length(); right++) {


            char current = s.charAt(right);
            frequency.put(
                    current,
                    frequency.getOrDefault(current, 0) + 1
            );


            while (frequency.size() > k) {


                char leftChar = s.charAt(left);
                left++;


                frequency.put(
                        leftChar,
                        frequency.getOrDefault(leftChar, 0) - 1
                );


                if (frequency.get(leftChar) == 0) {
                    frequency.remove(leftChar);
                }


            }


            maxLength = Math.max(maxLength, right - left + 1);


        }

return maxLength;

    }
}

/*


Complexity

Your solution is:

Time:  O(n)
Space: O(k)
 */
