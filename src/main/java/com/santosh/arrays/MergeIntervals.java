package com.santosh.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {


    public int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {

            return intervals;
        }


        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);


        List<int[]> res = new ArrayList<>();


        // First interval

        int start = intervals[0][0];

        int end = intervals[0][1];

        // Step 2: Process remaining intervals

        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];

            int currentEnd = intervals[i][1];



            // Overlapping


            if (currentEnd <= end ){

                end = Math.max(end, currentEnd);


            }

            // Non-overlapping

           else {

               res.add(new int[]{start, end});

               start = currentStart;
               end = currentEnd;


            }


            // Add the last interval


            res.add(new int[]{start, end});

           return res.toArray(new int[res.size()][]);



        }


    }

}
