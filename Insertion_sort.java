public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={42,20,2,52,9,37,6,21};
        //pick an element and put it at its right place
        //{2,8,10,12,5,34,27};
        //{2,5,8,10,12,34,27};
        int[] arr2=sort(arr);
        for (int val:arr2){
            System.out.println(val);
        }
    }
    static int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    swap(arr,j, i);
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr,int start,int end){
        for(int i=end;i>start;i--){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
    }
}
