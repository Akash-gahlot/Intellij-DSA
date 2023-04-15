package Amazon_Practice.BinarySearch;

public class Order_Not_known {
    public static void main(String[] args) {
        int[] array={6,5,4,3,2,1,0};
        int target=6;
        int answer=0;
        if(array[0]<array[array.length-1]){
            answer=normal_binary_search(array,target);
        }
        else{
            answer=reverse_binary_search(array,target);
        }
        System.out.println("Index value of target is :"+answer);
    }

     static int reverse_binary_search(int[] array, int target) {
         int start=0;
         int end= array.length-1;
         while(start<=end){
             int mid=start+(end-start)/2;
             if(target>array[mid]){
                 end=mid-1;
             }
             else if(target<array[mid]){
                 start=mid+1;
             }
             else if(target==array[mid]){
                 return mid;
             }
         }
         return -1;
    }

    static int normal_binary_search(int[] array,int target){
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
