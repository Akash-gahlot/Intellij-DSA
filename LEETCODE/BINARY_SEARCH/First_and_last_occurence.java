package LEETCODE.BINARY_SEARCH;

public class First_and_last_occurence {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,10,10,10,12,14,15,19,20,21,22,23,24,25,30};
        int val=10;
        display(arr,val);
    }
    static void display(int[] arr,int val){
        int[] ar={-1,-1};
        int count=0;
        int first=search(arr,val,true,count);
        int last=search(arr,val,false,count);
        ar[0]=first;
        ar[1]=last;
        System.out.println(last-first+1);
       // System.out.println(ar[0]+" "+ar[1]);

    }
    static int search(int[] arr ,int val,boolean firstindex,int count){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(val<arr[mid]){
                end=mid-1;
            }
            else if(val>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                count++;
                if(firstindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
