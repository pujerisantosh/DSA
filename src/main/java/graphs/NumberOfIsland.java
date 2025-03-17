package graphs;

import java.util.Enumeration;

public class NumberOfIsland {
    public int solve(int [][] A){

        int row = A.length;
        int col = A[0].length;
        int count =0;

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (A[i][j]==1){
                    dfs(A,i,j,row,col);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] a, int i, int j, int row, int col) {
        if (i<0 || i>=row || j<0 || j>=col || a[i][j]!=1){
            return;
        }

        a[i][j] =2;

        int[] dRow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dCol = {-1, 0, 1, -1, 1, -1, 0, 1};

        for(int k=0;k<8;k++){
            dfs(a,i+dRow[k],j+dCol[k],row,col);

        }
    }

    public static void main(String[] args) {
        NumberOfIsland num = new  NumberOfIsland();
        int [][] A = {{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}};


        int res = num.solve(A);
        System.out.println(res);

    }


}
