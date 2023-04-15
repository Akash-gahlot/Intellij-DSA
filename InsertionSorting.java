import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr={6,5,9,4,3,2,1,-1};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int val1,int val2){
        int temp=arr[val2];
        arr[val2]=arr[val1];
        arr[val1]=temp;

    }

}
