package com.binaryProblems;

public class nearlysortedArray {
    public static void main(String[] args) {
        int[] nums={2, 1, 3, 5, 4, 7, 6, 8, 9};
        int target=2;
        System.out.println(search(nums,target));

    }
    static int search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(mid-1>=start&&nums[mid-1]==target){
                return mid-1;
            }
            else if(mid+1<=end&&nums[mid+1]==target){
                return mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
}
