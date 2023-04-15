package com.company;

public class floornumber {
     public static void main(String[] Args){
         int[] nums={2,3,5,9,10,13,15,16,19,20};
         int target=18;
         int result=floor_return(nums,target);
         System.out.println(result);

     }
     //return the index smallest number<=target
     static int floor_return(int[] nums,int target){
         if(target>nums[nums.length-1]){
             return -1;
         }
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
             else{
                 return end;
             }
         }
         return end;

     }
}
