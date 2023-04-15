package Amazon_Practice.BinarySearch;

public class Binary_search_1 {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7};
        int target=8;
        int answer=binary_search(array,target);
        System.out.println(answer);

    }
    static int binary_search(int[] array,int target){
        int start=0;
        int end= array.length-1;
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
