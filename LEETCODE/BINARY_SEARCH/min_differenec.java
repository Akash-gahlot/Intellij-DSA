package LEETCODE.BINARY_SEARCH;

public class min_differenec {
    public static void main(String[] args) {
        int[] arr={4,6,10,13,15,17,18,22,25,26,29};
        int key=19;
        int floor_value=search(arr,key,true);
        int ceil_value=search(arr,key,false);
        int diff=Math.abs(key-floor_value);
        diff=Math.min(diff,Math.abs(key-ceil_value));
        System.out.println(diff);
    }
    static int search(int[] arr,int key,boolean floor_search){
        int start=0;
        int end=arr.length-1;
        int mid=-1;
        int res=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]<key){
                if(floor_search){
                    res=mid;
                }
                start=mid+1;
            }
            else if(arr[mid]>key){
                if(!floor_search){
                    res=mid;
                }
                end=mid-1;
            }
        }
        return arr[res];
    }
}
