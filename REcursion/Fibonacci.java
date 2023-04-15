package REcursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonaccivalue(5));

    }
    static int Fibonaccivalue(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            return Fibonaccivalue(n-1)+Fibonaccivalue(n-2);
        }
    }
}
