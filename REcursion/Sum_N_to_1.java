package REcursion;

public class Sum_N_to_1 {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        System.out.print(Sum(n,sum));
    }
    static int Sum(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=sum+n;
        return Sum(n-1,sum);

    }
}
