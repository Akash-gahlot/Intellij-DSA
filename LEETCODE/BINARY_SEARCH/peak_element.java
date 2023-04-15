package LEETCODE.BINARY_SEARCH;

public class peak_element {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,10,14,20};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1] && mid>start && mid<end){
                return mid;
            }
            if(mid== arr.length-1 && arr[mid]>arr[mid-1]){
                return mid;
            }
             if(mid== 0 && arr[mid]>arr[mid+1]){
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
