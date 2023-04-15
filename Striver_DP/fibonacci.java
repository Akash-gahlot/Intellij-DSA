package Striver_DP;

import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        int n=4;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(trib(dp,n));
      //  System.out.println(fobonacci_series(dp,val));
    }
//    static int fobonacci_series(int[] dp ,int val){
//        if(val<=1){
//            return val;
//        }
//        if(dp[val]!=-1){
//            return dp[val];
//        }
//       return  dp[val]=fobonacci_series(dp,val-1)+fobonacci_series(dp,val-2);
//
//    }
    static int trib(int[] dp,int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=trib(dp,n-1)+trib(dp,n-2)+trib(dp,n-3);
    }
}
