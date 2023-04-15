package REcursion;

public class CountZeroes {
    public static void main(String[] args) {
        int number=20100;
        int zeroes=0;
        System.out.println(count(number,zeroes));
    }
    static int count(int number,int zeroes){
        if(number==0){
            return zeroes;
        }
        int rem=number%10;
        if(rem==0){
            zeroes++;
        }
        return count(number/10,zeroes);
    }
}
