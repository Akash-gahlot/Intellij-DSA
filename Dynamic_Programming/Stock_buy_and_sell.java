package Dynamic_Programming;

import java.util.Arrays;

public class Stock_buy_and_sell {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        //System.out.println(max_profit(nums));
       /* for(int i=0;i<nums.length;i++){
            int max_profit=0;
            for(int j=i;j< nums.length;j++){
                if(nums[j]-nums[i]>max_profit){    ///Approach 1
                    max_profit=nums[j]-nums[i];
                }
            }
            nums[i]=max_profit;
        }
        System.out.println(Arrays.toString(nums));*/
    }
    static int max_profit(int[] nums){
        int msf=nums[0];     //minimum  value so far;
        int max_profit=0;
        for(int i=0;i< nums.length;i++){
            msf=Math.min(msf,nums[i]);
            int profit=nums[i]-msf;
            max_profit=Math.max(max_profit,profit);   //Calculating minimum so far value till now and calculate profit
        }                                             //of today if we sell it, and later calculate if it is max or not;
        return max_profit;
    }
}
