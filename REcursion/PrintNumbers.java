package REcursion;

public class PrintNumbers {
    public static void main(String[] args) {
        printnumber(10);

    }
    static void printnumber(int n){
        if(n==0){
            return;
        }
        printnumber(n-1);
        System.out.println(n);
    }

}
