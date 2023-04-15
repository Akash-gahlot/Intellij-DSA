package LEETCODE.BINARY_SEARCH;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int val=3;
        System.out.println(search(arr,3));
    }
    static int search(int[] arr,int val){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(val<arr[mid]){
                end=mid-1;
            }
            else if(val>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
