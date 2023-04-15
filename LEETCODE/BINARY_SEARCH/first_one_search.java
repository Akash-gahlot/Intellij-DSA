package LEETCODE.BINARY_SEARCH;

public class first_one_search {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0,0,0,0,0,1,1,2};
        System.out.println(search(arr,1));
    }
    static int search(int[] arr,int elem){
        int start=0;
        int end=arr.length-1;
        int mid=-1;
        int res=-1;
        while(start<=end){
             mid=start+(end-start)/2;

             if(arr[mid]<elem){
                 start=mid+1;
             }
             else if(arr[mid]>=elem){
                 res=mid;
                 end=mid-1;
             }
        }
        return res;
    }
}
