package code_signal;

public class actual_height {
    public static void main(String[] args) {
        int us=10;
        int ds=9;
        int desire=4;
        System.out.println(solution(us,ds,desire));
    }
    static int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int actual_height=0;
        int days=1;
        int h1=0;
        int h2=0;
        while(actual_height!=desiredHeight){
            h1=actual_height+upSpeed;
            if(h1==desiredHeight){
                return days;
            }
            h2=h1-downSpeed;
            if(h2==desiredHeight){
                return days;
            }
            actual_height=h2;
            days++;
        }
        return days;

    }

}
