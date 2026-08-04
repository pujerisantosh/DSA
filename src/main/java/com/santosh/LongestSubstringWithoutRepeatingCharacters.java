package com.santosh;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubString(String s) {

        int left = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);


            if (map.containsKey(c)) {

                left = Math.max(left, map.get(c) + 1);


            }

            map.put(c, right);


            int length = right - left + 1;

            max = Math.max(max, length);

        }
        return max;

    }







    /*


    Start = 0
    Expand until duplicate
    Record maximum length

Start = 1
    Expand until duplicate
    Record maximum length

Start = 2
    Expand until duplicate
    Record maximum length


nterviewer

Why is the algorithm O(n) and not O(2n)?

Many candidates say:

"Left pointer moves n times and right pointer moves n times, so it's O(2n)."

Step 1: Brute Force

You said:

Start from every index and expand until you find a duplicate.

Complexity:

Time: O(n²)
Space: depends on implementation (often O(n) if you use a set for each start).
Step 2: What's the problem?

You identified:

We're repeating work.

Correct.

Step 3: Do we need to restart?

Initially you thought:

Yes.

Then after we discussed it, you realized:

No. We already have a valid window. We should keep it and adjust it instead of rebuilding it.

This is the biggest conceptual leap in Sliding Window.

Step 4: Which pointer moves?

You correctly answered:

Move the left pointer.

Not the right pointer.

Step 5: Can pointers move backward?

You answered:

No.

Exactly.

That means:

Right pointer visits each character once.
Left pointer visits each character at most once.

So if the string has n characters:

Right pointer → n moves
Left pointer  → n moves

Total = 2n

And in Big-O:

O(2n) = O(n)
Interview Tip

If an interviewer asks:

"Why is the Sliding Window solution O(n)?"

A strong answer is:

"Because both pointers only move forward. The right pointer processes each character once, and the left pointer also advances at most once per character. Even though there are two pointers, the total number of pointer movements is at most 2n, which simplifies to O(n)."

That's a complete and convincing explanation.
...
     */


}
