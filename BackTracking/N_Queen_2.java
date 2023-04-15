package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queen_2 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(solveNQueens(n));

    }
    static List<List<String>> solveNQueens(int n) {
        List<List<String>> allboards=new ArrayList<>();
        char[][] mainboard=new char[n][n];
        placequeen(mainboard,0,allboards);
        return allboards;
    }
    static void placequeen(char[][] mainboard,int row,List<List<String>> allBoards){
        if(row== mainboard.length) {
            saveBoard(mainboard,allBoards);
            return;
        }
        for(int col=0;col< mainboard[0].length;col++){
            if(isSafe(row,col,mainboard)){
                mainboard[row][col]='Q';
                placequeen(mainboard,row+1,allBoards);
                mainboard[row][col]='.';
            }
        }
    }

    static boolean isSafe(int row,int col,char[][] mainboard){
        //check horizontally
        for(int i=0;i<mainboard[row].length;i++){
            if(mainboard[row][col]=='Q'){
                return false;
            }
        }
        //check vertically
        for(int i=0;i< mainboard.length;i++){
            if(mainboard[i][col]=='Q'){
                return false;
            }
        }

        //check upperleft
        int r=row;
        for(int c=col ;c>=0 && r>=0;c--,r--){
            if(mainboard[r][c]=='Q'){
                return false;
            }
        }
        //check upperright
        r=row;
        for(int c=col;c< mainboard[row].length && r>=0;c++,r--){
            if(mainboard[r][c]=='Q'){
                return false;
            }
        }

        //checklowerleft
        r=row;
        for(int c=col;c>=0 && r< mainboard.length;r++,c--){
            if(mainboard[r][c]=='Q'){
                return false;
            }
        }
        //checklowerright
        r=row;
        for(int c=col;r< mainboard.length && c<mainboard[row].length;r++,c++){
            if(mainboard[r][c]=='Q'){
                return false;
            }
        }
        return true;


    }
    static void saveBoard(char[][] mainboard, List<List<String>> allboards){
        String row="";
        List<String> newboard=new ArrayList<>();
        for(int i=0;i<mainboard.length;i++){
            row="";
            for(int j=0;j<mainboard[i].length;j++){
                if(mainboard[i][j]=='Q'){
                    row+="Q";
                }
                else{
                    row+=".";
                }
            }
            newboard.add(row);
        }
        allboards.add(newboard);
    }
}
