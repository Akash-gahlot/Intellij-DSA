package code_signal;

public class CodeBots {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1,0},
                         {0,5,0,1},
                         {2,1,3,10}};
        System.out.println(cost_sum(matrix));

    }
    static int cost_sum(int[][] matrix)
    {
        int row=0;
        int col=0;
        int sum=0;
        for(row=0;row< matrix.length;row++){
            for(col=0;col<matrix[row].length;col++){
                if(row==0){
                    sum+=matrix[row][col];
                }
                else {
                    int zero_found=1;
                    int val=row;
                    while(val!=0){
                        if(matrix[val-1][col]==0){
                            zero_found=0;
                            break;
                        }
                        else{
                            val--;
                        }
                    }
                    if(zero_found!=0){
                        sum+=matrix[row][col];
                    }
                }
            }
        }

return sum;
    }
}
