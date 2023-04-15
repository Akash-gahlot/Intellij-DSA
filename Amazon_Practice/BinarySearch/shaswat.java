package Amazon_Practice.BinarySearch;

import javax.crypto.spec.PSource;

public class shaswat {
    public static void main(String[] args) {
        int[][] arr = {
                {
                        1, 0, 2, 0, 0, 4
                },
                {
                        18, 1, 5, 0, 0, 9
                },
                {
                        3, 5, 3, 6, 0, 4
                },
                {
                        2, 0, 8, 0, 0, 7
                },
                {
                        7, 0, 4, 0, 6, 0
                },
                {
                        0, 0, 1, 0, 0, 0
                }
        };
        System.out.println(sum(arr,0));

    }


    static int sum(int[][] matrix, int sum) {
        for (int row = 1; row < matrix.length - 1; row++) {
            for (int col = 1; col < matrix.length; col++) {
                if (row != 1 || row != matrix.length - 1) {
                    if (col != matrix.length - 1) {
                        sum += matrix[row][col];
                    }
                }
            }
        }
        return sum;
    }

}