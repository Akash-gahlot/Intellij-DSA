package Amazon_Practice.BinarySearch;

public class floor_element_search {
    public static void main(String[] args) {
        int[] array={1,2,3,5,7,8,10,12,15};
        int target=4;
        System.out.println(floor_search(array,target));
    }
    static int floor_search(int[] array,int target){
        int start=0;
        int end= array.length-1;
        int floor_value=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<array[mid]){
                end=mid-1;
            }
            else if(target>array[mid]){
                floor_value=array[mid];
                start=mid+1;
            }
            else if(target==array[mid]) {
                return array[mid];

            }
        }
        return floor_value;
    }
}
