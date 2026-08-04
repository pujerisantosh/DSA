package com.santosh;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpan {


    public int[] solve(int[] prices) {
        int n = prices.length;

        int[] span = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty()
                    && prices[stack.peek()] <= prices[i]) {

                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }
    }





    /*

    This is the key idea of Monotonic Stack

When a larger element arrives:

Remove all smaller elements.
They are permanently useless.
This avoids scanning them again later.
That's why the algorithm becomes O(n).



The brute-force approach checks previous prices for every index,
causing repeated scanning and an O(n²) time complexity. To optimize,
I use a monotonic decreasing stack that stores indices.
 Before processing the current price,
 I remove all previous prices that are smaller than or equal to it because they can never become the previous greater element for future prices. Each index is pushed once and popped at most once, resulting in O(n) time complexity. The stack can hold up to n indices in the worst case,
 so the auxiliary space complexity is O(n).
     */





