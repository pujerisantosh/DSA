package interFace;

import java.util.HashMap;

public class TwoSumOptimizedOne {

    public static int[] solve(int[] nums , int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){

            int complement = target-nums[i];

            if (map.containsKey(complement)){

                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

return new int[]{};

    }
}


/*

I use a HashMap to store visited elements and their
indices. For each element, I calculate the complement
(target - current value) and check if it already exists in the map.
If yes, I return the indices. This reduces time complexity from O(n²) to O(n)
 */