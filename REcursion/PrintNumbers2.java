package REcursion;

public class PrintNumbers2 {
    public static void main(String[] args) {
        printnumber(10);
}
    static void printnumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnumber(n-1);


    }

}
