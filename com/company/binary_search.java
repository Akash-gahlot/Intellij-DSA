package com.company;

public class binary_search {
    public static  void main(String[] Args){
        int[] arr={1,2,3,4,9,12,56,58,89,100};
        int target=100;
        System.out.println(binaryseacrh(arr,target));

    }
    static int binaryseacrh(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;

    }
}
