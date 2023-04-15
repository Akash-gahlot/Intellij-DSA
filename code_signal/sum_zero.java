package code_signal;

public class sum_zero {
    public static void main(String[] args) {
        int n=10;
        System.out.println(solution_2(n));



    }
   static boolean solution(int n) {
        double value= Math.ceil(Math.log((n)));
        value=Math.ceil((value/2)/2);
        int left_sum=0;
        int right_sum=0;
        int i=1;
       int j=0;
       int k=1;
        while(i<=value){
            int left_rem=(int)((n%(Math.pow(10,value*value-j)))/(int)(Math.pow(10,(value*value-1-j))));
            left_sum+=left_rem;
            int right_rem=(n%((int)Math.pow(10, k)))/10;
            right_sum+=right_rem;
            j++;
            i++;
            k++;
        }
        if(left_sum-right_sum==0){
            return true;
        }
        return false;

    }
    static boolean solution_2(int n){
        String val=""+n;
        int left_sum=0;
        int right_sum=0;
        int len=val.length()/2;
        for(int i=0;i<len;i++){
            left_sum+=(int)val.charAt(i)-48;
            right_sum+=(int)val.charAt(val.length()-1-i)-48;
        }
        if(left_sum-right_sum==0){
            return true;
        }
        return false;
    }

}
