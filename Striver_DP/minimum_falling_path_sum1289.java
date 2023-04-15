package Striver_DP;

public class minimum_falling_path_sum1289 {
    public static void main(String[] args) {
        int[][] grid={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(min(grid));
    }
    static int min(int[][] grid){
        int min_value=100000;
        int row=0;
        int col=-1;
        int val=100000;
        for(int i=0;i<=grid.length;i++){

          //  min_value=Math.min(min_value,grid[0][0]);
            if(col==-1 || col==row){
                min_value=Math.min(100000,min_value);
                row=0;
                col++;
            }
            else {
             val=grid[row+1][col];
            min_value=Math.min(val,min_value);
            row=0;
            col++;
            }
        }
        return min_value+grid[0][0];
    }

}
