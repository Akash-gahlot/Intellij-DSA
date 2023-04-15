package REcursion;

public class Pattern1 {
    public static void main(String[] args) {
        int row2=5;
        int col2=1;
        //patternapproach1(row,col);
        patternapproach2(row2,col2);
    }
    /*static void patternapproach1(int row,int col){
        if(row>5){
            return;
        }
        for(int i=1;i<=col;i++){     ////       APPROACH1
            System.out.print("*"+" ");
        }
        System.out.println();
        pattern(row+1,col-1);
    }*/

   static  void patternapproach2(int row2,int col2){
       if(row2==0){
           return;
       }
       if(col2<=row2){
           System.out.print("*"+" ");
           patternapproach2(row2,col2+1);
       }else{
           System.out.println();
           patternapproach2(row2-1,1);
       }
   }

}
/******
****
***
**
**/
