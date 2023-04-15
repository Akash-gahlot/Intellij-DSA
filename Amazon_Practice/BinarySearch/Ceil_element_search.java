package Amazon_Practice.BinarySearch;

public class Ceil_element_search {
    public static void main(String[] args) {
        int[] array={1,2,3,5,7,8,10,12,15};
        int target=14;
        System.out.println(ceil_search(array,target));
    }
    static int ceil_search(int[] array,int target){
        int start=0;
        int end= array.length-1;
        int ceil_value=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<array[mid]){
                ceil_value=array[mid];
                end=mid-1;
            }
            else if(target>array[mid]){
                start=mid+1;
            }
            else if(target==array[mid]) {
                return array[mid];

            }
        }
        return ceil_value;
    }
}
