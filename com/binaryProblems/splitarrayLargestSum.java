
package com.binaryProblems;
import java.util.*;

public class splitarrayLargestSum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int m=2;
        System.out.println(maxsum(nums,m));

    }
    static int maxsum(int[] nums,int m){
        int start=0;
        int end=0;
        for(int i:nums){
            end+=i;        //the sum of array
            start=Math.max(start,i); //here at the end we will get the max value in array;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;   // calculate the pieces required to divide the array
            for(int val:nums){
                if(sum+val>mid){
                    sum=val;   //add the next value to new subarrau;
                    pieces++;  //increase the value of pieces
                }
                else{
                    sum+=val;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;  //start==end


    }
}
