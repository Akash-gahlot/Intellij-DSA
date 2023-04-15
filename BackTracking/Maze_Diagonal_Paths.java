package BackTracking;

import java.util.ArrayList;

public class Maze_Diagonal_Paths {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
        ans=Diagonalpath("",3,3);
        System.out.println(ans);
    }
    static ArrayList<String> Diagonalpath(String PS,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list2=new ArrayList<>();
            list2.add(PS);
            return list2;
        }
        ArrayList<String> mainlist=new ArrayList<>();
        if(row>1 && col>1){
            mainlist.addAll(Diagonalpath(PS+"D",row-1,col-1));
        }
        if(row>1){
            mainlist.addAll(Diagonalpath(PS+'V',row-1,col));
        }
        if(col>1){
            mainlist.addAll(Diagonalpath(PS+'H',row,col-1));
        }
        return mainlist;

    }
}
