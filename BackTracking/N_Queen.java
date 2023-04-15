package BackTracking;

public class N_Queen {
    public static void main(String[] args) {
        int size=4;
        boolean[][] board=new boolean[size][size];
        place_queen(board,0);

    }
    static void place_queen(boolean[][] board,int row){
        if(row== board.length){
            display(board);
            System.out.println();
            return;
        }
        //place the queen and check for every row and column
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                place_queen(board,row+1);
                board[row][col]=false;
            }
        }
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //moce vertically
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //move maxleft
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //move right
        int maxright=Math.min(row, board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board){
        for(boolean[] row:board){
            for (boolean val:row){
                if(val){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
