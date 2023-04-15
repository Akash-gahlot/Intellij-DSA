package com.binaryProblems;

public class arrangecoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));

    }
    static int arrangeCoins(int n) {
        int count=1;
        if(n<=0){
            return 0;
        }
        else{
            while(n>0){
                n=n-count;
                if(n-count<0){
                    break;
                }
                count++;
            }
        }
        return count-1;

    }
}
