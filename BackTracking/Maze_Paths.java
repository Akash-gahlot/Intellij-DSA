package BackTracking;

public class Maze_Paths {
    public static void main(String[] args) {
        path("",3,3);

    }
    static void path(String PS,int row,int col){
        if(row==1 && col==1){
            System.out.println(PS);
            return;
        }
        if(row>1){
            path(PS+'D',row-1,col);
        }
        if(col>1){
            path(PS+'R',row,col-1);
        }
    }
}
