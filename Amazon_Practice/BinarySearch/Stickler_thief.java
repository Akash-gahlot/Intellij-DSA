package Amazon_Practice.BinarySearch;

public class Stickler_thief {
    public static void main(String[] args) {
        int n=6;
        int[] arr={5,5,10,100,10,5};
       System.out.println(FindMaxSum(arr,n-1));
    }
    static int FindMaxSum(int arr[], int index)
    {
        //using recursion
        if(index<=-1){
            return 0;
        }
        int sum1=arr[index]+FindMaxSum(arr,index-2);
        int sum2=FindMaxSum(arr,index-1);
        return Math.max(sum1,sum2);

    }
}
