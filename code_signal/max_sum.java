package code_signal;

public class max_sum {
    public static void main(String[] args) {
        System.out.println(solution(152));

    }
    static int solution(int n) {
        int max_num=0;
        String num=""+n;
        int count=0;
        int sum=0;
        int val=0;
        for(int i=0;i<num.length();i++){
            sum=0;
            for(int j=0;j<num.length();j++){
                if(count!=j){
                     val= num.charAt(j)- 48;
                    sum= sum* 10 +val;
                }
            }
            count++;
            max_num=Math.max(max_num,sum);
        }


        return max_num;
    }

}
