package Striver_DP;

public class min_cost_climb_stairs_746 {
    public static void main(String[] args) {
        int[] cost={1,100,1,1,1,100,1,1,100,1};
        System.out.println(Math.min(Cost(cost,0,0),Cost(cost,1,0)));
    }
    static int Cost(int[] cost,int index,int val){
        if(index==cost.length-2){

            return Math.min(cost[cost.length-2],cost[cost.length-1]);
        }
        if(index== cost.length-1){
            return cost[cost.length-1];
        }
        if(index> cost.length-1){
            return 0;
        }
        int one_climb=val+cost[index]+Cost(cost,index+1,val);
        int two_climb=val+cost[index+1]+Cost(cost,index+2,val);
        return Math.min(one_climb,two_climb);
    }
}
