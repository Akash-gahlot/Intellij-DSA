package com.binaryProblems;

import java.util.Arrays;

public class Arraysearching2D {
    public static void main(String[] args) {
        int[][] nums= {{1}};
        int target=1;
        System.out.println(searchMatrix(nums,target));
      //  System.out.println(Arrays.toString(search(nums,target)));


    }
    static int[] search(int[][] nums,int target){
        int[] arr=new int[2];
        int i=0;
        int j=nums[0].length-1;
        while(i>=0 && i<nums.length && j>=0 && j< nums[0].length){ // i is for no. or rows and j is for no. columns in arrays.
            if(nums[i][j]==target){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
            else if(target>nums[i][j]){
                i++;
            }
            else if(target<nums[i][j]){
                j--;
            }
        }
        return new int[]{-1,-1};
    }


    static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        boolean find=false;
        while(row<matrix.length && row>=0 && col>=0 && col<matrix[0].length){
            if(target>matrix[row][col]){
                row++;
            }
            else if(target<matrix[row][col]){
                col--;
            }
            else if(target==matrix[row][col]){
                return true;
            }
        }
        return false;
    }

}
