package graphs;

import java.util.ArrayList;
import java.util.List;

public class DFSC {

    public int solve(int A , int[][] B){

        //intialize the adjecent list

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i=0;i<=A;i++){
            adjList.add(new ArrayList<>());
        }

        // build the graph from input edges

        for(int[] edges : B){
            adjList.get(edges[0]).add(edges[1]);
        }

        // Arrays for tracking visited nodes and recursion stack

        boolean[] visited = new  boolean[A+1];
        boolean[] recStack = new boolean[A+1];

        // Step 3: Perform DFS on each unvisited node

  for (int i=1;i<=A;i++){
      if (!visited[i]){
          if (dfsCycle(i,adjList,visited,recStack)){
              return 1;
          }
      }

        }

  return 0;

    }

    private boolean dfsCycle(int node, List<List<Integer>> adjList, boolean[] visited, boolean[] recStack) {

        visited[node] = true;
        recStack[node]= true;

        //// Explore all adjacent nodes

        for(int neighbour : adjList.get(node) ){
            if (!visited[neighbour]){
                if (dfsCycle(neighbour,adjList,visited,recStack)){
                    return true;
                }
            } else if (recStack[neighbour]) {

                return true;

            }
        }

        recStack[node] = false;
        return false;
    }
}
