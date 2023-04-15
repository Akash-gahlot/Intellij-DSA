package com.binaryProblems;

public class occurenceCOUNT {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,4,5,6,7,7,7,8};
        int target=1;
        System.out.println(totaloccurence(nums,target));

    }
    static int totaloccurence(int[] nums,int target){
        int first=binaryseacrh(nums,target,true);
        int last=binaryseacrh(nums,target,false);
        return last-first+1;
    }
    static int binaryseacrh(int[] nums,int target,boolean leftsidecount){

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
            else {
                ans=mid;

                if(leftsidecount){
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
