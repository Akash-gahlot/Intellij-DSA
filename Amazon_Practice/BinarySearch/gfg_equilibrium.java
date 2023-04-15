package Amazon_Practice.BinarySearch;

public class gfg_equilibrium {
    public static void main(String[] args) {
        long[] arr={4 ,42 ,27 ,16, 28 ,3 ,4 ,5 ,9 ,3 ,31 ,5 ,5 ,29 ,10 ,18 ,35 ,35 ,33 ,
                19 ,41 ,23 ,8, 32 ,9 ,5 ,8 ,18 ,35 ,13 ,6 ,7 ,6 ,10 ,11 ,13 ,37 ,2 ,25 ,7 ,28 ,43};
        int n=42;
        System.out.println(equilibriumPoint(arr,n));
    }
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum1=0;
        // int sum2=0;
        int left=0;
        int right=n-1;
        for(int i=0;i<n/2;i++){
            sum1+=arr[left];
            //  sum2+=arr[right];
            sum1=sum1-(int)arr[right];
            if((sum1==0)){
                return left+=2;
            }
            else{
                left++;
                right--;
            }
        }
        return -1;
    }
}
