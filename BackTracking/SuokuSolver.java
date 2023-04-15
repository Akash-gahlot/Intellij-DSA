package BackTracking;

import java.util.Arrays;

public class SuokuSolver {
    public static void main(String[] args) {
        char[][] mainboard={{'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}};
        //System.out.println(String.valueOf('9'));
        sudokusolve(mainboard);
        for(char[] rows:mainboard){
            System.out.println(Arrays.toString(rows));

        }
    }
    static boolean sudokusolve(char[][] mainboard){
        for(int row=0;row<mainboard.length;row++){
            for(int col=0;col<mainboard[row].length;col++){
                if(mainboard[row][col]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isSafe(mainboard,row,col,c)) {
                            mainboard[row][col] = c;
                            if (sudokusolve(mainboard) == true) {
                                return true;
                            } else {
                                mainboard[row][col] = '.';
                            }
                        }

                    }
                    return false;
                }
            }

        }
        return true;

    }
    static boolean isSafe(char[][] mainboard,int row,int col,char c){
        for(int i=0;i<9;i++){
            //check horizontally
            if(mainboard[row][i]==c){
                return false;
            }
            if(mainboard[i][col]==c){
                return false;
            }
            if(mainboard[3*(row/3)+i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }
        return true;
    }



}
