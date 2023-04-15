package com.binaryProblems;

public class CeilElement {
    public static void main(String[] args) {
        int[] nums={1, 2, 8, 10, 10, 12, 15,16,18,19,20};
        int target=17;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ceilvalue=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                ceilvalue=nums[mid];
                end=mid-1;

            }
            else if(target==nums[mid]){
                return target;
            }
        }return ceilvalue;
    }
}
