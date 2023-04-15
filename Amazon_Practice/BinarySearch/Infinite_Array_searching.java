package Amazon_Practice.BinarySearch;

public class Infinite_Array_searching {
    public static void main(String[] args) {
        int[] array={1,3,4,5,6,8,9,10,12,13,15,16,18,19,22,25,28,30,32};
        int target=1;
        System.out.println(find_size(array,target));


    }
    static int find_size(int[] array,int target){
        int start=0;
        int end=2;
        while(target>array[end]){
            start=end+1;
            end=end*2;
        }
        return binary_search(array,target,start,end);


    }
    static int binary_search(int[] array,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>array[mid]){
                start=mid+1;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
            else if(target==array[mid]){
                return mid;
            }
        }
        return -1;
    }
}

