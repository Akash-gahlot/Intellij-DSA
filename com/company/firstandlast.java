package com.company;

import java.util.Arrays;

public class firstandlast {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        searchRange(nums,target);

    }
    static void searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int s=search(nums,target,true);//return first occurence index
        int l=search(nums,target,false);//return last occurence index
        ans[0]=s;
        ans[1]=l;

        System.out.println(Arrays.toString(ans));;
    }
    //this function will simply return the target index value
    static int search(int[] nums,int target,boolean firstindex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
