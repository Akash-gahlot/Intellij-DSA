package com.binaryProblems;

public class NumberTimesArrayRotated {
    public static void main(String[] args) {
        int[] nums={15,9,11,12,13,14};
        System.out.println(countRotation(nums));

    }
    static int countRotation(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&nums[mid]>nums[mid+1]){
                return mid+1;
            }
            if(mid>start&&nums[mid]<nums[mid-1]){
                return mid;
            }
            if(nums[start]>nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return 0;
    }
}
