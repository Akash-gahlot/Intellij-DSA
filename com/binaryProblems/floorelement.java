package com.binaryProblems;

public class floorelement {
    public static void main(String[] args) {
        int[] nums={1, 2, 8, 10, 10, 12, 19};
        int target=9;
        System.out.println(search(nums,target));

    }
    static int search(int[] nums,int target){
        int start=0;
        int floorvalue=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                floorvalue=nums[mid];
                start=mid+1;
            }
            else if(target==nums[mid]){
                return target;
            }
        }
        return floorvalue;
    }
}
