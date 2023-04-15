package Amazon_Practice.BinarySearch;

public class Biotonic_search {
    public static void main(String[] args) {
        int[] array={1,3,5,8,10,12,4,2,0};  //find max element in this array
        System.out.println(find_max(array));
    }
    static int find_max(int[] array){
        int start=0;
        int end=array.length-1;
      while (start<=end){
          int mid=start+(end-start)/2;
          if(array[mid]>array[mid+1] && array[mid]>array[mid-1]){
              return mid;
          }
          else if(array[mid]>array[mid-1]){
              start=mid+1;
          }
          else {
              end=mid-1;
          }
      }
      return -1;
    }
}
