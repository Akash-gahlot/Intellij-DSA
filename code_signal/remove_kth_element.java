package code_signal;

public class remove_kth_element {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k=3;
        solution2(arr,k);
    }
//    static int[] solution(int[] inputArray, int k) {
//        if(k==inputArray.length){
//            for(int i=0;i<inputArray.length-1;i++){
//                inputArray[i]=inputArray[i];
//            }
//            return inputArray;
//        }
//        else{
//            int val=0;
//            while(val!=k-1){
//                for(int i=val;i<k-2;i++){
//                    inputArray[i]=inputArray[i];
//                }
//                val++;
//            }
//            while(i!=inputArray.length-1){
//                swap(inputArray,i);
//            }
//        }
//
//    }
//    private void swap(int[] inputArray,int n){
//        int temp=inputArray[]
//    }
    static int[] solution2(int[] inputArray, int k)
    {
        for(int i=0;i<inputArray.length;i++){
            if((i+1)%k==0){
                inputArray[i]=inputArray[i+1];
                inputArray[i+1]= 0;
            }
        }
        for (int val:inputArray) {
            System.out.println(val);
        }
        return inputArray;
    }


}
