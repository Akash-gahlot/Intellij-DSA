package LEETCODE.BINARY_SEARCH;

public class floor_element {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,10,10,12,19};
        int element=5;
        System.out.println(search(arr,element));
    }
    static int search(int[] arr,int element){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int cand=-1;
        while(start<=end)
        {
           mid=start+(end-start)/2;
            if(arr[mid]>element){
                end=mid-1;
            }
            else if(arr[mid]<element){
                cand=mid;
                start=mid+1;
            }
            else if(element==arr[mid]){
                return mid;
            }
        }
        return cand;
    }
}
