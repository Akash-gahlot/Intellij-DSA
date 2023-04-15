package code_signal;

public class sum_of_digit_one {
    public static void main(String[] args) {
        System.out.println(solution(1000000000));
    }
    static int solution(int n) {
        int count=1;
        int val=n;
        if(n>=0 &&n<10){
            return 0;
        }
        else{
            while ((val=find_sum(val))>9){
                find_sum(val);
                count++;
            }

        }
        return count;
    }
    static int find_sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }


}
