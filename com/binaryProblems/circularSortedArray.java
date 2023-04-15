package com.binaryProblems;

public class circularSortedArray {
    public static void main(String[] args) {
        int[] arr={8,9,10,11,12,1, 2, 3, 4, 5, 6, 7 };
        System.out.println(search(arr,2));

    }
    static int search(int[] arr,int target){
        int piv=pivot(arr);
        if(piv==-1){
            //means array was not rotated and pivot value is -1
            //then perform normal binary search
            return binarysearch(arr,target,0,arr.length-1);
        }
            //we are able to find pivot that means array is rotated
            if(arr[piv]==target){
                return piv;
            }
            if(target>=arr[0]){
                return binarysearch(arr,target,0,piv-1);
            }
            return binarysearch(arr,target,piv+1,arr.length-1);


        }

    static  int binarysearch(int[] arr,int target,int start,int end){
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

    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){   //case 1
                    return mid;
            }
            if(mid>start&&arr[mid]<arr[mid-1]){  //case 2
                    return mid-1;
            }
            if(arr[start]>=arr[mid]){        //case 3
                end=mid-1;
            }
            else{
                start=mid+1;         //case4
            }

        }
         return -1;


    }
}
