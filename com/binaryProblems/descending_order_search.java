package com.binaryProblems;

public class descending_order_search {
    public static void main(String[] args) {

        int[] nums ={20,15,13,12,8,5,3,2,1};
        int target=1;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                start=mid+1;
            }
            else if(target>nums[mid]){
                end=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
