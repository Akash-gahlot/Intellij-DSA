package REcursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=3242;
        int sum=0;
        System.out.println(sum(n,sum));
    }
    static int sum(int n,int sum){
        if(n<=0){
            return sum;
        }
        sum=sum+n%10;
        return sum(n/10,sum);
    }
}
