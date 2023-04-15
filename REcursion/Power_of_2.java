package REcursion;

public class Power_of_2 {
    public static void main(String[] args) {
        double number=0.00001;       //0.00001
        int times=2147483647;
        System.out.println(myPow(number,times));

    }
    static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n>0){
            return findpower(x,n);
        }
        return 1/findpower(x,Math.abs(n));
    }
    static double findpower(double number,long times){
        if(times==1){
            return number;
        }
        return number*findpower(number,times-1);
    }
}
