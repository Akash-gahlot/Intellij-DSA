package Striver_DP;

public class minimum_path_sum {
   // 2147483647
   public static void main(String[] args) {
       int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
       System.out.println(Sum(grid,0,0));
   }
   static int Sum(int[][] grid,int row,int col){
       if(row==grid.length-1 && col==grid[0].length-1){
           return grid[row][col];
       }
       if(row>grid.length-1 || col>grid[0].length-1){
           return 100000;
       }
       int down=grid[row][col]+Sum(grid,row+1,col);
       int right=grid[row][col]+Sum(grid,row,col+1);
       return Math.min(down,right);
   }
}
