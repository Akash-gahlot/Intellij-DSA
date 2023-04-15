package REcursion;

public class Reverse_Digit {
    public static void main(String[] args) {
        int n=7658;        //only non-zeroes digits can get reverse via this function
        int digit=0;
        System.out.println(reverse_digit(n,digit));
    }
    static int reverse_digit(int n,int digit){
        if(n==0){
            return digit;
        }
        digit=digit*10+(n%10);
        return reverse_digit(n/10,digit);
    }

}
