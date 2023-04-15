package com.binaryProblems;

import java.util.Arrays;

public class firstANDlastoccurence {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,4,5};
        int target=4;
        range(nums,target);
    }
    static void range(int[] nums,int target){
        int[] arr={-1,-1};
        int first=binarysearch(nums,target,true);
        int last=binarysearch(nums,target,false);
        if(first==-1 && last==-1){
            System.out.println(Arrays.toString(arr));

        }
        else{
            arr[0]=first;
            arr[1]=last;
            System.out.println(Arrays.toString(arr));
        }

    }
    static int binarysearch(int[] nums,int target,boolean firstindex){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
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
