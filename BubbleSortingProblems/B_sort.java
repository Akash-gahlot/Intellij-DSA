package BubbleSortingProblems;

public class B_sort {
    public static void main(String[] args) {
        int[] arr={56,34,23,78,43,1,226,21,0,90};
        int[] arr2=sort(arr);
        for (int val:arr2){
            System.out.println(val);
        }

    }
    static int[] sort(int[] arr){
        int n=arr.length-1;
        while(n>=0){
            for(int k=0;k<=n-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
            n--;
        }
         return arr;
    }

}
