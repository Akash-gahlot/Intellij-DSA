package code_signal;

public class kth_remove {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k=3;

        System.out.println(solution(arr,k));
    }
   static int[] solution(int[] inputArray, int k) {
        int size=inputArray.length-inputArray.length/k;
        int[] arr=new int[size];
        if(k==1){
            return arr;
        }
        else{
            int val=0;
            for(int i=0;i<inputArray.length;i++){
                if((i+1)%k!=0){
                    arr[val]=inputArray[i];
                    val++;
                }
            }
        }
        return arr;
    }
}
