package com.binaryProblems;

public class BiotonincArray {  //Array which is monotonically increasing at peak point and later decrese after peak element
    public static void main(String[] args) {
        int[] nums={2,5,7,9,13,14,17,18,20,21,16,12,11};
        System.out.println(searchMax(nums));

    }
    static int searchMax(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]>nums[mid-1]){
                start=mid+1;
            }
            else if(nums[mid]<nums[mid-1]){
                end=mid-1;
            }
        }
        return 0;
    }
}
