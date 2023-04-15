package BackTracking;

import java.util.ArrayList;

public class Maze_With_Obstacles {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
        boolean[][] board={{true,true,true},
                           {true,true,true},
                           {true,true,true}};
        ans=Obstaclepath(board,"",0,0);
        System.out.println(ans);


    }
    static ArrayList<String> Obstaclepath(boolean[][] maze,String PS,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(PS);
            return list;
        }
        ArrayList<String> mainlist=new ArrayList<>();
        if(maze[row][col]==false){
            return mainlist;
        }
        maze[row][col]=false;
        if(row<maze.length-1 ){
            mainlist.addAll(Obstaclepath(maze,PS+'D',row+1,col));
        }
        if(col< maze[0].length-1){
            mainlist.addAll(Obstaclepath(maze,PS+'R',row,col+1));
        }
        if(row>0){
            mainlist.addAll(Obstaclepath(maze,PS+'U',row-1,col));
        }
        if(col>0){
            mainlist.addAll(Obstaclepath(maze,PS+'L',row,col-1));
        }
        maze[row][col]=true;
        return mainlist;

    }

}
