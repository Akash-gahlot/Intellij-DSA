package com.binaryProblems;

public class orderagnosticsearch {
    public static void main(String[] args) {
        int[] nums={10,8,4,3,2,1};
        int target=10;
        System.out.println(applysearching(nums,target));
    }
    static int applysearching(int[] nums,int target){
        int start=0;
        int end= nums.length-1;
        boolean asc=verify(nums,0,nums.length-1);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(asc){
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
            else{
                if(target>nums[mid]){
                    end=mid-1;
                }
                else if(target<nums[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }


        }
        return -1;
    }
    static boolean verify(int[] nums,int start,int end){
        if(nums[start]<nums[end]){
            return true;
        }
        return false;
    }
}
