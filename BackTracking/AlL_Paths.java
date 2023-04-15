package BackTracking;

public class AlL_Paths {
    public static void main(String[] args) {
       all_possible_Path("",3,3);

    }
    static void all_possible_Path(String PS,int row,int col){
        if(row ==1 && col==1){
            System.out.println(PS);
            return;
        }
        //Down
        if(row>1){
            all_possible_Path(PS+"V",row-1,col);
        }
        //right side
        if(col>1) {
            all_possible_Path(PS + "H", row, col - 1);
        }
        //diagonally
        if(row >1 && col>1){
            all_possible_Path(PS+"D",row-1,col-1);
        }
        //up direction


    }
}
