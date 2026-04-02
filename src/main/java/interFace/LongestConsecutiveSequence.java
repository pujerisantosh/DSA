package interFace;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {


    public int solve(int[] arr){

        Set<Integer> set = new HashSet<>();

        for (int num : arr){

            set.add(num);
        }

        int maxLen =0;


        for (int num : set){

            if (!set.contains(num-1)){

                int current = num;
                int count =1;

                while (set.contains(current+1)){
                    current++;
                    count++;
                }


                maxLen = Math.max(maxLen, count);
            }


            }


        return  maxLen;
        }




}

/*

time and space o(n);
 */