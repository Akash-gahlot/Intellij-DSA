package Striver_DP;

import java.util.Arrays;

public class minimumFallingPathSum_931 {
    public static void main(String[] args) {
        int[][] matrix={{2,1,3},{6,5,4},{7,8,9}};
        int[][] dp=new int[matrix.length][matrix[0].length];
        for (int[] row:dp) {
            Arrays.fill(row,-1);
        }
        int min_sum=Integer.MAX_VALUE;
       // System.out.println(find_min(matrix,dp,0,2,0,0));
        System.out.println(min_sum(matrix,dp,0,-1,10000,0));
    }
//    public int minFallingPathSum(int[][] matrix) {
//
//    }
        static int min_sum(int[][] matrix,int[][] dp,int row,int col,int min_sum ,int index){
        if(index==matrix.length){
            return min_sum;
        }
         min_sum=Math.min(find_min(matrix,dp,0,col+1,min_sum,index),min_sum);
        return min_sum(matrix,dp,0,col=index,min_sum,index+1);
    }
    static int find_min(int[][] matrix ,int[][] dp,int row,int col,int min_sum,int index){
        if(row== matrix.length-1 && col>=0 && col < matrix[row].length){
            return matrix[row][col];
        }
        if(row<0 || col<0 || row> matrix.length-1 || col>matrix[row].length-1){
            return 100000;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int left_diagonal=matrix[row][col]+find_min(matrix,dp,row+1,col-1,min_sum,index);
        int just_below=matrix[row][col]+find_min(matrix,dp,row+1,col,min_sum,index);
        int right_diagonal=matrix[row][col]+find_min(matrix,dp,row+1,col+1,min_sum,index);
       // min_sum=Math.min(left_diagonal,just_below);
      //  min_sum=Math.min(just_below,left_diagonal);
        return dp[row][col]=Math.min(left_diagonal,Math.min(just_below,right_diagonal));
    }
}
