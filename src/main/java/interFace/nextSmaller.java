package interFace;

import java.util.Stack;

public class nextSmaller {


    public static int[] solve(int[] nums){

        int n = nums.length;

        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();


        for (int i=n-1;i>=0;i--){


            while (!st.isEmpty() && st.peek() >= nums[i]){

                st.pop();


            }


            res[i] = st.isEmpty() ?  -1: st.peek();

            st.push(nums[i]);
        }


        return res;

    }
}




/*

time and space o(n);
 */