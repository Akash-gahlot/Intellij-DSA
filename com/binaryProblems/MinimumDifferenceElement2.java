package com.binaryProblems;

public class MinimumDifferenceElement2 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6,7,10,14,18,20,21,24,25,26,28,30};
        int target=29;
        System.out.println(searchMinimumkey(nums,target));
    }
    static int searchMinimumkey(int[] nums,int target){
        int start=0;                               //this is the second approach to solve minimum difference questions
        int end=nums.length-1;
        while(start<=end){                    //simple implement binary search to array
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return target;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
        }
        return minimumvalue(nums,target,start,end);    //pass the start and end values as parameter.

    }
    static int minimumvalue(int[] nums,int target,int key1,int key2){
        if((target-nums[key1])>(target-nums[key2])){
            return nums[key2];                             //whichever value brings minimum difference return that value
        }
        return nums[key1];
    }

}
