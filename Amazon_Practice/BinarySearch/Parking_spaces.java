package Amazon_Practice.BinarySearch;

public class Parking_spaces {
    public static void main(String[] args) {
        int[][] arr={{0,1,0},{1,1,0},{1,1,0},{1,1,1}};
        System.out.println(count_full_space(arr,4,3));
    }
    static  int count_full_space(int[][] arr,int r,int c){
        int count_one=0;
        int max_one=0;
        int max_row_index=0;
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                if(arr[row][col]==1){
                    count_one++;
                }
            }
            if(count_one>max_one){
                max_one=count_one;
                max_row_index=row;
            }
        }
        return max_row_index;
    }
}
