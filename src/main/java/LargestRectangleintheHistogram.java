public class LargestRectangleintheHistogram {


    public int largestRectangleArea(int[] heights) {

        int maxArea = 0;

        for(int i=0;i<heights.length;i++){

            int minHeight = heights[i];

            for(int j=i;j<heights.length;j++){

                minHeight = Math.min(minHeight, heights[j]);

                int area = minHeight * (j-i+1);

                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    /*

    Time

O(n²)

Space

O(1)

    The optimization

The brute-force solution is:

For each building, search left.
For each building, search right.

Worst case:

O(n²)

The optimized solution is:

Use a monotonic increasing stack to find the Previous Smaller Element (PSE)
 and Next Smaller Element (NSE) for every building in O(n).
     */
}
