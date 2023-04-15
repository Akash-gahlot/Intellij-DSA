package Amazon_Practice.BinarySearch;

public class nearly_sorted_array {
    public static void main(String[] args) {
        int[] array={2, 1, 3, 5, 4, 7, 6, 8, 9};
        int target=2;
        System.out.println(nearly_search(array,target));
    }
static int nearly_search(int[] array,int target){
        int start=0;
        int end= array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }
            else if(mid-1>start&&array[mid-1]==target){
                return mid-1;
            }
            else if(mid+1<end&&array[mid+1]==target){
                return mid+1;
            }
            else if(target>array[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
