package REcursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=0;
        System.out.println(check(n));
    }
    static boolean check(int n){
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2==1){
            return false;
        }
        return check(n/2);
    }
}
