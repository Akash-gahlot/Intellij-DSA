package com.binaryProblems;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] nums={2,1,3,5,4,1};
        System.out.println(search(nums));
    }
    static int search(int[] nums){
        int start=0;
        int end=nums.length-1;
        int dup=-1;
        while(start<=end){
            int count=0;
            int mid=start+(end-start)/2;
            for(int num:nums){
                if(num<=mid){
                    count++;
                }
            }
            if(count>mid){
                dup=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return dup;
    }
}
