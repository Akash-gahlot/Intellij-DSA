package Striver_DP;

import java.util.Hashtable;

public class Buy_and_sell_stock_121 {
    public static void main(String[] args) {
        int[] prices={3,1,4,8,7,2,5};
        System.out.println(maxProfit(prices));
        //Hashtable<Integer, Integer> dp=new Hashtable<>();
       // System.out.println(profit(nums,0,0,dp));
    }
//    static int profit(int[] nums,int index,int profit,Hashtable<Integer, Integer> dp){
//        if(index>nums.length-1){
//            return profit;
//        }
//         profit=Math.max(profit,calculate(nums,index,0,dp));
//        return profit(nums, index+1, profit,dp);
//    }
//    static int calculate(int[] nums, int i, int val, Hashtable<Integer, Integer> dp){
//        if(dp.containsKey(nums[i])){
//            return dp.get(nums[i]);
//        }
//        else {
//            for (int j = i; j < nums.length; j++) {
//                if (nums[j] >= nums[i]) {
//                    val = Math.max(val, nums[j] - nums[i]);
//                }
//            }
//        }
//        dp.put(nums[i],val);
//        return val;
//    }
    static int maxProfit(int[] prices) {
        int msf=prices[0];
        int max_profit=0;
        for(int i=1;i< prices.length;i++){
            if(prices[i]<msf){
                msf=prices[i];
                max_profit=Math.max(max_profit,prices[i]-msf);
            }
            else{
                max_profit=Math.max(max_profit,prices[i]-msf);
            }
        }
        return max_profit;
    }
}
