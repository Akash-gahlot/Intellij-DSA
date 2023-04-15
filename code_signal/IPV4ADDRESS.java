package code_signal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPV4ADDRESS {
    public static void main(String[] args) {
        String val="172.16.254.1";
        System.out.println(solution(val));
    }
   static boolean solution(String inputString) {
       String zeroTo255
               = "(\\d{1,2}|(0|1)\\"
               + "d{2}|2[0-4]\\d|25[0-5])";
       String regex
               = zeroTo255 + "\\."
               + zeroTo255 + "\\."
               + zeroTo255 + "\\."
               + zeroTo255;
       Pattern pattern = Pattern.compile(regex);
      // Matcher matcher = pattern.matcher("(([0-9] | [1-9][0-9] | 1[0-9][0-9] | 2[0-4][0-9] | 25[0-5])\\.){3}([0-9] | [1-9][0-9] 1[0-9][0-9] | 2[0-4][0-9] | 25[0-5])");
       Matcher matcher = pattern.matcher(inputString);

       boolean matchFound = matcher.find();
       if(matchFound) {
           return true;
       }
       return false;

   }

    static boolean solution_2(String inputString){
        int sum=0;
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)>=97 && inputString.charAt(i)<=122){
                return false;
            }
            else if(inputString.charAt(i)=='.'){
                if(sum>255){
                    return false;
                }
                else{
                    sum=0;
                }

            }
            else {
                int val=inputString.charAt(i)-'0';
                sum=10*sum+val;
            }
        }
        return true;
    }

}
