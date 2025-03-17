package graphs;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionDFS {

    public int solve(int A , int[][] B){

        List<List<Integer>> adjacentList = new ArrayList<>();

        for(int i=0; i<=A; i++){
            adjacentList.add(new ArrayList<>());


        }

       // Build the graph from input edges

        for (int[] edge : B){
            adjacentList.get(edge[0]).add(edge[1]);

        }

        // Arrays for tracking visited nodes and recursion stack

        boolean[] visted = new boolean[A+1];
        boolean[]  recStack  = new boolean[A+1];

        // Step 3: Perform DFS on each unvisited node

        for (int i=1;i<=A;i++){

            if (!visted[i]){
                if ( isCycleDFS(i, adjacentList,visted, recStack)){
                    return 1;
                }
            }

        }

        return 0;


    }

    private boolean isCycleDFS(int node, List<List<Integer>> adjacentList, boolean[] visted, boolean[] recStack) {

        visted[node] = true;
        recStack[node] = true;

        // Explore all adjacent nodes

        for (int nieghbour : adjacentList.get(node)){
            if (!visted[nieghbour]){
                if (isCycleDFS(nieghbour,adjacentList,visted,recStack)) {

                    return true;
                }
                } else if (recStack[nieghbour]) {
                    return true;
                    
                }
            }

// Remove node from recursion stack after exploring all paths
            recStack[node] = false;
            return false;

        }

        // Main method for testing

    public static void main(String[] args) {

        CycleDetectionDFS cdf = new CycleDetectionDFS();
        int A = 5;
        int [] [] B ={{1, 2}, {4, 1}, {2, 4}, {3, 4}, {5, 2}, {1, 3} } ;

        int res = cdf.solve(A,B);

        System.out.println(res);
    }



}
