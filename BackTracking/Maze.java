package BackTracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count_paths(3,7));

    }
    static int count_paths(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int down=count_paths(row-1,col);
        int right=count_paths(row,col-1);
        return down+right;
    }
}
