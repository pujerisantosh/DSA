package com.santosh.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {


    public int findMaxLength(int[] nums) {


        public int findMaxLength ( int[] nums){

            Map<Integer, Integer> map = new HashMap<>();

            int balance = 0;
            int maxLength = 0;

            map.put(0, -1);

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == 0) {
                    balance--;
                } else {
                    balance++;
                }

                if (map.containsKey(balance)) {

                    int length = i - map.get(balance);

                    maxLength = Math.max(maxLength, length);

                } else {

                    map.put(balance, i);
                }
            }

            return maxLength;
        }
    }


}

/*

I convert 0 to -1 and 1 to +1,
 so finding equal numbers of zeros and ones becomes
  finding a subarray with sum zero.
  I store the first index of each prefix balance in a HashMap.
  When the same balance appears again,
  the difference between the current index and the first index gives the length of a balanced subarray.”

Time: O(n)
Space: O(n)
 */
