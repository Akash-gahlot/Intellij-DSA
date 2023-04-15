package Striver_DP;

import java.util.Arrays;

public class unique_paths2 {
    public static void main(String[] args) {
        int[][] grid={{0,0},{0,1}};
        int[][] dp=new int[grid.length][grid[0].length];
        for (int[] n:dp) {
            Arrays.fill(n,-1);
        }
        System.out.println(path(grid,dp,0,0));
    }
    static int path(int[][] grid,int[][]dp,int row,int col){
        if(row== grid.length-1 && col==grid[0].length-1 && grid[row][col]!=1){
            return 1;
        }
        if(row> grid.length-1 || col>grid[0].length-1){
            return 0;
        }

        if(grid[row][col]==1){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        return dp[row][col]=path(grid,dp,row+1,col)+path(grid,dp,row,col+1);
    }
}
