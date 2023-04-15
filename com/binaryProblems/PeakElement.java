package com.binaryProblems;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums={5,15,20,70,40,50};
        System.out.println(search(nums));
    }
    static int search(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && mid<nums.length-1){          //considering mid is not present at first and last index of array
                if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                    return mid;                      //if mid is greater than it both side element return its index value
                }
                else if(nums[mid]<nums[mid-1]){   //if mid value  is less than is left side value than search search in left side of array
                    end=mid-1;
                }
                else{
                    start=mid+1;         //if mid value  is less than is right side value than search search in right side of array
                }
            }
            else if(mid==0){
                if(nums[mid]>nums[mid+1]){   //considering mid is present at 0 index value
                    return 0;
                }                               //now we can compare mid value with its right side value only
                {
                    return 1;
                }
            }
            else if(mid==nums.length-1){   //considering mid is present at last index value
                if(nums[mid]>nums[mid-1]){
                    return mid;            //now we can compare mid value with left side value only
                }
                else{
                    return mid-2;
                }
            }
        }
        return 0;
    }
}
