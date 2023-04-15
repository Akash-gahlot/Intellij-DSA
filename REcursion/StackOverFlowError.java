package REcursion;

public class StackOverFlowError {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        print(n+1);
    }
}
