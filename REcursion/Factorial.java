package REcursion;

public class Factorial {
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }
    static int factorial(int n){
      //  int val=1;
        if(n==0){
            return 1;
        }
        return n *factorial(n-1);
    }
}
