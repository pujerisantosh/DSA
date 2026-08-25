package com.santosh.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {



        public String solve(String s, String t) {

            if (s == null || t == null || s.length() < t.length()) {
                return "";
            }

            Map<Character, Integer> required = new HashMap<>();
            Map<Character, Integer> window = new HashMap<>();

            // Build frequency map for t
            for (char c : t.toCharArray()) {
                required.put(
                        c,
                        required.getOrDefault(c, 0) + 1
                );
            }

            int left = 0;
            int formed = 0;

            int minLength = Integer.MAX_VALUE;
            int start = 0;

            for (int right = 0; right < s.length(); right++) {

                char current = s.charAt(right);

                // Add current character to window
                window.put(
                        current,
                        window.getOrDefault(current, 0) + 1
                );

                // Check whether current character satisfies
                // its required frequency
                if (required.containsKey(current)
                        && window.get(current).equals(required.get(current))) {

                    formed++;
                }

                // Window is valid when all required characters
                // have their required frequencies
                while (formed == required.size()) {

                    // Update minimum window
                    if (right - left + 1 < minLength) {
                        minLength = right - left + 1;
                        start = left;
                    }

                    char leftChar = s.charAt(left);

                    // Remove left character
                    window.put(
                            leftChar,
                            window.get(leftChar) - 1
                    );

                    // Removing this character made the window invalid
                    if (required.containsKey(leftChar)
                            && window.get(leftChar) < required.get(leftChar)) {

                        formed--;
                    }

                    left++;
                }
            }

            if (minLength == Integer.MAX_VALUE) {
                return "";
            }

            return s.substring(start, start + minLength);
        }
}



/*


Time:  O(|s| + |t|)
Space: O(|s| + |t|)
 */