package com.company;

public class BS2 {
    public static  void main(String[] Args){
        int[] arr={20,18,16,14,12,10,8,2};
        int target=10;
        System.out.println(binaryseacrh(arr,target));

    }


    static int binaryseacrh(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean asc=arr[start]<arr[end];
        //check the nums array is in ascending order or decreasing order
        while(start<=end){

            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                    return mid;
            }
            if(asc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }



        }
        return -1;

    }
}

