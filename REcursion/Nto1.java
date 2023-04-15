package REcursion;

public class Nto1 {
    public static void main(String[] args) {
        int n=10;
        fun(n);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
