package REcursion;

public class CountSteps {
    public static void main(String[] args) {
        int number=14;
        int steps=0;
        System.out.println(count(number,steps));
    }
    static int count(int number,int steps){
        if(number==0){
            return steps;
        }
        if(number%2==0){
            return count(number/2,steps+1);
        }
        return count(number-1,steps+1);
    }
}
