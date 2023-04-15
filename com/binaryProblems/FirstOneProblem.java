package com.binaryProblems;

public class FirstOneProblem {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,1,1,1,1};
        int target=1;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target){
        int index=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target==nums[mid]){
                index=mid;
                end=mid-1;
            }
        }
        return index;
    }
}
