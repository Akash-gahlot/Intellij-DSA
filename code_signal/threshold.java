package code_signal;

public class threshold {
    public static void main(String[] args) {
        System.out.println(solution(100,20,170));
    }
    static int solution(int deposit, int rate, int threshold) {
        int count=0;
        //double new_rate=100/rate;
        //double new_deposit=deposit;
        while(deposit<threshold){
             deposit=deposit+deposit*rate/100;
            count++;
        }
        return count;
    }

}
