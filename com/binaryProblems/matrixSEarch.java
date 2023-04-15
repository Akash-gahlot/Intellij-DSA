package com.binaryProblems;

public class matrixSEarch {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        int target=-11;
        System.out.println(searchMatrix(matrix,target));

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int end=matrix[0].length-1;
            while(start>=0 && start< matrix.length && end>=0 && end< matrix[0].length){
            if(target==matrix[start][end]){
                return true;
            }
            else if(target>matrix[start][end] && start+1<matrix.length){
                start++;
            }
            else if(target<matrix[start][end] && end-1>=0){
                end--;
            }
            else {
                return false;
            }

        }
        return false;
    }
}

