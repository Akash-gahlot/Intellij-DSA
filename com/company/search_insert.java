package com.company;

public class search_insert {
    public static void main(String[] Args){
        int[] nums={1,3,5};
        int target=3;
        int result=searchInsert(nums,target);
        System.out.println(result);
    }
     //return the smallest number>=target
    static  int searchInsert(int [] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else if(target==nums[mid]){
                return mid;
            }
            else {
                return start;
            }

        }
        return start;
    }
}
