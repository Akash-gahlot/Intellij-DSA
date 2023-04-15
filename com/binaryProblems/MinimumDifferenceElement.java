package com.binaryProblems;

public class MinimumDifferenceElement {
    public static void main(String[] args) {
        int[] nums={1,3,5,6,7,10,14,18,20,21,24,25,26,28,30};
        int target=23;
        System.out.println(searchMinimumkey(nums,target));
    }
    static int searchMinimumkey(int[] nums,int target){
        int key1=0;
        int key2=0;
        int start=0;

        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                key1=nums[mid];
                start=mid+1;
            }
            else if(target<nums[mid]){
                key2=nums[mid];
                end=mid-1;
            }
        }
        return minimumvalue(target,key1,key2);    //search for floor and ceil value of array
    }
    static int minimumvalue(int target,int key1,int key2){
        if((target-key1)>(target-key2)){
            return key2;                       //whichever value brings minimum difference return that value
        }
        return key1;
    }
}
