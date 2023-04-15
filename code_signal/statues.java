package code_signal;

public class statues {
    public static void main(String[] args) {
        int[] arr={6,2,3,8};
        System.out.println(count_statues(arr));
    }
    static int count_statues(int[] arr){

        int count=0;
        for(int i=0;i<arr.length-1;i++){
           int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff>1){
                count++;
            }


        }
        return count+1;
    }
}
