package code_signal;

public class minesweeper {
    public static void main(String[] args) {
        boolean[][] matrix={{true,false,false},
                {false,true,false},
                {false,false,false}};
        solution(matrix);
    }
    static int[][] solution(boolean[][] matrix) {

        int[][] m = new int[matrix.length][];
        for(int i=0; i<matrix.length; i++)
            m[i] = new int [matrix[i].length];

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length; j++){
                for(int k=i-1; k<i+2; k++)
                    for(int l=j-1; l<j+2; l++)
                        if(k>=0 && k<matrix.length && l>=0 && l<matrix[i].length &&
                                !(k==i && j==l) && matrix[k][l])
                            m[i][j]++;
            }
        for (int[] val:m) {
            for (int val2:val
                 ) {
                System.out.print(val2+" ");

            }
        }

        return m;
    }

}
