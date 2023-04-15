package LEETCODE.BINARY_SEARCH;

public class ceil_element {
    public static void main(String[] args) {
        char[] arr={'a','b','c','c','d','e','f','h','i','j','l','m'};
        char element='k';
        System.out.println(search(arr,element));
    }
    static char search(char[] arr,char element){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        char cand='a';
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]>element){
                cand=arr[mid];
                end=mid-1;
            }
            else if(arr[mid]<element){
                start=mid+1;
            }
            else if(element==arr[mid]){
                return arr[mid];
            }
        }
        return cand;
    }
}
