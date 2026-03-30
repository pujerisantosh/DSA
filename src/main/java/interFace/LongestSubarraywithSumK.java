package interFace;

import java.util.HashMap;

public class LongestSubarraywithSumK {


    public static int solve(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // case 1: full subarray from 0 to i

            if (sum == k) {

                maxLen = i + 1;
            }


            // case 2: subarray exists

            if (map.containsKey(k - sum)) {

                int len = map.get(k - sum);

                maxLen = Math.max(maxLen, len);
            }


            // store only first occurrence

            if (!map.containsKey(k - sum)) {

                map.put(sum, i);
            }


        }


        return maxLen;
    }

}


/*


   Pattern: Prefix Sum + HashMap
👉 Goal: Understand how to convert nested loops → O(n)
     */

