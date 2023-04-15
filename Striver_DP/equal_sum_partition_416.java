package Striver_DP;

import java.util.Arrays;
import java.util.HashMap;

public class equal_sum_partition_416 {
    public static void main(String[] args) {
        int[] nums={1,5,11,5};
        //HashMap<String, Boolean> map = new HashMap<>();
       // System.out.println(odd_even(nums,0,0,map));
       // System.out.println(canPartition(nums));
        System.out.println(sum(nums,0,0));
    }
    static boolean sum(int[] nums,int sum,int index){
        if(index== nums.length){
            if(sum%2!=0){
                return false;
            }
            int[][] dp=new int[nums.length][sum+1];
            for (int[] row:dp) {
                Arrays.fill(row,-1);
            }
            return check_subarray(nums,dp, nums.length-1, sum/2);
        }
        return sum(nums,sum+nums[index],index+1);
    }
    static boolean check_subarray(int[] nums,int[][] dp,int index,int target){
        if(target==0){
            return true;
        }
        if(index==0) {
            return nums[index]==target;
        }
        if(dp[index][target]!=-1){
            return dp[index][target]==1?true:false;
        }
        boolean not_take=check_subarray(nums,dp,index-1,target);
        boolean take=false;
        if(nums[index]<=target){
            take=check_subarray(nums,dp,index-1,target-nums[index]);
        }
        dp[index][target]=not_take||take?1:0;
        return not_take|| take;
    }


//    static boolean canPartition(int[] nums) {
//        int sum =0;
//        int n = nums.length;
//
//        for(int i=0;i <nums.length;i++){
//            sum+=nums[i];
//        }
//        if(sum %2 != 0) return false;
//        int target = sum/2;
//        int[][] dp = new int[n][target+1];
//        for(int[] s : dp){
//            Arrays.fill(s,-1);
//        }
//        return subsetSum(nums.length-1,nums,sum/2,dp);
//
//    }
//    static  boolean subsetSum(int index,int [] nums,int target,int[][]dp){
//        if(target == 0) return true;
//        if(index == 0 ) return nums[index] == target;
//        if(dp[index][target] != -1) return dp[index][target]==0?false:true;
//        boolean notTake = subsetSum(index-1,nums,target,dp);
//        boolean take = false;
//        if(target >= nums[index]){
//            take = subsetSum(index-1,nums,target-nums[index],dp);
//        }
//
//        dp[index][target]=notTake||take?1:0;
//        return notTake || take;
//    }
}
