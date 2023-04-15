package com.binaryProblems;

public class searchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={7,8,9,2,3,4,5,6};
        int target=6;
        System.out.println(binarysearch(nums,target));

    }
    static int binarysearch(int[] nums,int target){
        int value=pivot(nums);
        int end=nums.length-1;
        int start=0;
        if(target<=nums[end]){     //if our target value is less or equal to last element of array then search it in right sorted array
             start=value;
        }
        else{
            end=value-1;      // else search our target value in left half only .
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }

            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }
    static int pivot(int[] nums){      //find the minimum element  index value
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
