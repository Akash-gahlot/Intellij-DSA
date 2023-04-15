package com.binaryProblems;

public class SearchInBiotonicArray {
    public static void main(String[] args) {
        int[] nums={1,3,8,12,16,18,10,5,4};
        int target=8;
        System.out.println(search(nums,target));

    }
    static int search(int[] nums,int target){
        int peakvalue=peakelement(nums);    //first search for the index value of peak element in array
        int val1=binarysearch1(nums,target,0,peakvalue); //search target in left side of array
        int val2=binarysearch2(nums,target,peakvalue+1,nums.length-1); //search target in right sode of array
        if(val1!=-1){
            return val1;
        }
        return val2;
    }
    static int binarysearch1(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;               //binary search operation in left side of array that is increasing part of array
            }
            else if(target==nums[mid]){
                return mid;
            }
        }
        return -1;

    }
    static int binarysearch2(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                end=mid-1;
            }                           //binary search opeartion in right side of array that is decreasing part of array
            else if(target<nums[mid]){
                start=mid+1;
            }
            else if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
    }

    static int peakelement(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else if(nums[mid]<nums[mid-1]){
                end=mid-1;
            }

        }
        return -1;
    }
}
