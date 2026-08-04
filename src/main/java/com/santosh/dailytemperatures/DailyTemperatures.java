package com.santosh.dailytemperatures;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public int[] solve(int[] temp) {

        int n = temp.length;

        int[] ans = new int[n];


        Stack<Integer> st = new Stack<>();

        for (int i=0;i<n;i++){


            while (!st.isEmpty()  &&  temp[i] > temp[st.peek()]){

                int index = st.pop();

                ans[index] = i-index;








            }


            st.push(i);
        }

        return ans;

    }

    static void main(String[] args) {
        DailyTemperatures dt = new DailyTemperatures();

        int[] remp = {30,40,50,60};

        System.out.println(Arrays.toString(dt.solve(remp)));
    }
}

/*

Daily Temperatures – Interview Cheat Sheet
1. Problem
Given an array of temperatures.
Find the number of days until a warmer temperature.
If no warmer temperature exists, return 0.
2. Brute Force
For every element, check all future elements.
Stop when a warmer temperature is found.
Time Complexity
O(n²)
Auxiliary Space Complexity
O(1)
3. Optimal Approach

Use a Monotonic Decreasing Stack.

Store indices, not temperatures.

4. Why store indices?

Because the problem asks:

How many days later?

Need

answer = currentIndex - previousIndex

Without indices, we cannot calculate the number of days.

5. Why not store temperatures?

Temperatures tell us whether it's warmer.

Indices tell us where it occurred.

We need both, so we store indices and access temperatures using those indices.

6. Why Stack?

Stack follows LIFO (Last In, First Out).

The most recently unresolved temperature should be checked first.

A Queue (FIFO) would process the oldest unresolved temperature first, which doesn't match this problem.

7. Why Monotonic Decreasing?

The stack always stores indices whose temperatures are in decreasing order.

Example:

75
71
69

When a warmer temperature arrives, all smaller temperatures are resolved and removed.

8. Algorithm

For every index:

while (!stack.isEmpty()
       && temperatures[i] > temperatures[stack.peek()]) {

    int index = stack.pop();

    answer[index] = i - index;
}

stack.push(i);
9. Why push current index?

Because its warmer day has not yet been found.

It must wait for future temperatures.

10. Why pop?

Because we have found the next warmer day.

Its answer is complete.

No need to keep it in the stack.

11. Why Time Complexity = O(n)?

Every index is:

Pushed once
Popped at most once

Maximum stack operations:

Push = n

Pop ≤ n

Total operations ≤ 2n

Therefore:

O(n)
12. Why Auxiliary Space = O(n)?

Worst case:

100
90
80
70
60

Nothing gets popped.

Stack stores all indices.

Maximum stack size = n

Therefore:

O(n)
13. Pattern

This is the Next Greater Element pattern.

The same idea is used in:

Daily Temperatures
Next Greater Element
Stock Span
Largest Rectangle in Histogram
Trapping Rain Water (related stack usage)
14. Interview Keywords

If an interviewer asks "Explain your approach," you can say:

"I solve this using a monotonic decreasing stack that stores indices.
 As I iterate through the array,
 whenever the current temperature is greater than the temperature at the index
 on the top of the stack, I pop that index and calculate the waiting days as currentIndex - poppedIndex.
 Each index is pushed once and popped at most once, giving an O(n) time complexity. The stack may hold up to n indices in the worst case,
so the auxiliary space complexity is O(n)."
 */