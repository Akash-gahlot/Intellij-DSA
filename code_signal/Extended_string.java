package code_signal;

public class Extended_string {
    public static void main(String[] args) {
        System.out.println(solution("010010000110010101101100011011000110111100100001"));
    }
    static String solution(String code) {
        String str="";
        int sum=0;
        int c1=7;
        int val=0;
        for(int i=0;i<code.length();i++){
            if((i+1)%8==0){
                val=code.charAt(i)-48;
                if(val==1){
                    sum+=Math.pow(2, c1);
                }
                str+=(char)sum;
                c1=7;
                sum=0;
            }
            else{
                val=code.charAt(i)-48;
                if(val==1){
                    sum+=Math.pow(2, c1);
                }
                c1--;
            }

        }
        return str;

    }

}
