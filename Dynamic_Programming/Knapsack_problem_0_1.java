package Dynamic_Programming;

public class Knapsack_problem_0_1 {
    public static void main(String[] args) {
        int[] val={10,20,30};
        int[] weight={1,1,1};
        int W=2;
        int size= val.length;
        System.out.println(max_Profit(val,weight,W,size));
    }
    static int max_Profit(int[] val,int[] weight,int W,int size){
        if(size==0 || W==0){
            return 0;
        }
        if(weight[size-1]<=W){
            return Math.max(val[size-1]+max_Profit(val,weight,W-weight[size-1],size-1),max_Profit(val,weight,W,size-1));

        }
        return max_Profit(val,weight,W,size-1);
    }
}
