package LEETCODE.BINARY_SEARCH;

public class Rotated_array {
    public static void main(String[] args) {
        int[] arr={11,12,15,18,2,5,6,8};
        System.out.println(count_rotation(arr));
    }
    static int count_rotation(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(arr[mid]<arr[mid-1] && mid>start){
                return mid;
            }
            else if(arr[mid]>arr[mid-1] && mid>start){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
