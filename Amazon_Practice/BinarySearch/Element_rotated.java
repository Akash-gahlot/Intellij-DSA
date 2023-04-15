package Amazon_Practice.BinarySearch;
//1..find pivot
//2..find target value compare it with pivot
public class Element_rotated {
    public static void main(String[] args) {
        int[] array={11,12,5,6,7,8,9};
        int target=5;
        //System.out.println(pivot_index(array));
        int pivot=pivot_index(array);
        int answer_1=binary_search_left(array,target,pivot);
        int answer_2=binary_search_right(array,target,pivot);
        if(answer_1!=-1){
            System.out.println(answer_1);
        }
        else{
            System.out.println(answer_2);
        }
    }
    static int binary_search_left(int[] array,int target,int pivot){
        int start=0;
        int end= pivot;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>array[mid]){
                start=mid+1;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int binary_search_right(int[] array,int target,int pivot){
        int start=pivot+1;
        int end= array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>array[mid]){
                start=mid+1;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int pivot_index(int[] array){
        int start=0;
        int end= array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
           if(array[mid]>array[mid+1] && mid<=end){
           return mid;
           }
           else if(array[start]>array[mid]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
        }
        return -1;
    }
}
