package Selection_sort;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={13,42,26,52,9,37,6,21};
        int[] arr2=sorting(arr);
        for (int val:arr2){
            System.out.println(val);
        }

    }
    static  int[] sorting(int[] arr){
        //step 1 : pick smallest value from array.
        //step2: swap it to the left most index value.
        int min_value=Integer.MAX_VALUE;
        int min_index=0;
        for(int i=0;i<arr.length-1;i++)
        {
            min_value=arr[i];
            min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min_value){
                    min_value=arr[j];
                    min_index=j;
                }
            }
            swap(min_index,i,arr);
        }
        return arr;
    }
    static void swap(int index1, int index2 ,int[] arr){
        int temp=arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
    }
}
