package com.binaryProblems;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums={1,3,4,5,6,8,10,12,15,16,17,18,20,24,25,27,29,30,31,32,33,34,35,37,40,42,44,45,46,49,50};
        int target=1;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target){
        int index=0;
        int start=0;
        int end=2;
        while(target>nums[end]){
            start=end+1;
            end=end*2;
        }
        index=binary_search(nums,start,end,target);
        return index;
    }
    static int binary_search(int[] nums,int start,int end,int target){
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;

            }
            else{
                return mid;
            }

        }
        return mid;

    }
}
