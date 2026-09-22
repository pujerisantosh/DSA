package com.santosh.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {


    public char firstNonRepeating(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // First pass: count characters
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Second pass: find first character with count 1
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // no non-repeating character
    }
}


/*


Time: O(n)
Space: O(k) where k = distinct characters

requency Counting / HashMap + Two-Pass Traversal
 */