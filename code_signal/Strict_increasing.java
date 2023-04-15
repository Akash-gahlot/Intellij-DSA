package code_signal;

public class Strict_increasing {
    public static void main(String[] args) {
       int[] arr={1,3,2,1};
      //  int[] arr={1,3,2};
        System.out.println(check_increase(arr));
    }
    static boolean check_increase(int[] arr){
        int numErr = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i+1] >= 0) {
                numErr += 1;
                if (i - 1 >= 0 && i + 2 <= arr.length - 1
                        && arr[i] - arr[i+2] >= 0
                        && arr[i-1] - arr[i+1] >= 0) {
                    return false;
                }
            }
        }

        return numErr <= 1;

    }
}
