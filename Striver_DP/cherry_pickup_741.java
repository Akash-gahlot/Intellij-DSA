package Striver_DP;

import java.util.Arrays;

public class cherry_pickup_741 {
    public static void main(String[] args) {
        int[][] grid={{0,1,-1},{1,0,-1},{1,1,1}};
        int[][] dp=new int[grid.length][grid[0].length];
        for (int[] rows:dp) {
            Arrays.fill(dp,-1);
        }
    }
    static int max_cherry(int[][] grid,int row,int col,int cherry,int[][] dp){
        if(row> grid.length-1 && col>grid[row].length-1){

        }
        if(row> grid.length-1 || col> grid.length-1){
            return 0;
        }
        if(dp[row][col]!=1){
            return dp[row][col];
        }
        if(grid[row][col]==1){
            cherry+=1;
            grid[row][col]=-2;
        }
        return 0;


    }
}
