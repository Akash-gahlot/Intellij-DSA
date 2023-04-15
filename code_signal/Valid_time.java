package code_signal;

public class Valid_time {
    public static void main(String[] args) {
        System.out.println(solution("13:58"));
    }
   static boolean solution(String time) {
        int sum_1=0;
        int sum_2=0;
        for(int i=0;i<time.length();i++){
            if(i==2){
                if(!(sum_1>=0 && sum_1<=23)){
                    return false;
                }
            }
            if(i>=3){
                int val=time.charAt(i)-48;
                sum_2=sum_2*10 +val;
            }
            if(i<=1){
                int val=time.charAt(i)-48;
                sum_1=sum_1*10+val;
            }
        }
        if(sum_1 ==0 && sum_2==0){
            return false;
        }
        else if(!(sum_2>=1 && sum_2<=59)){
            return false;
        }
        return true;

    }

}
