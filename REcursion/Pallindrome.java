package REcursion;
import REcursion.Reverse_Digit;
public class Pallindrome {
    public static void main(String[] args) {
        int number=1211;
        int digit=0;
        System.out.println(ISpallindrome(number,digit));
    }
    static boolean ISpallindrome(int number,int digit){
        int result=Reverse_Digit.reverse_digit(number,digit);
        if(result==number){
            return true;
        }
        return false;
    }
}