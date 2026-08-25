package com.santosh.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {



    public int solve(String s, int k) {

        Map<Character, Integer> frequency = new HashMap<>();

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            frequency.put(
                    current,
                    frequency.getOrDefault(current, 0) + 1
            );

            maxFrequency = Math.max(
                    maxFrequency,
                    frequency.get(current)
            );

            while ((right - left + 1) - maxFrequency > k) {

                char leftChar = s.charAt(left);

                frequency.put(
                        leftChar,
                        frequency.get(leftChar) - 1
                );

                left++;
            }

            maxLength = Math.max(
                    maxLength,
                    right - left + 1
            );
        }

        return maxLength;
    }
}



/*


Time: O(n) for this implementation's window processing.
Space: O(m),
where m is the number of distinct characters tracked.
If the input is restricted to uppercase English letters,
this is effectively O(1).
 */