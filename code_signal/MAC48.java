package code_signal;

public class MAC48 {
    public static void main(String[] args) {
        System.out.println(solution("00-1B-63-84-45-E6"));
    }
   static boolean solution(String inputString) {
        for(int i=0;i<inputString.length();i++){
            if(!((inputString.charAt(i)>=48 && inputString.charAt(i)<=57) || (inputString.charAt(i)>='A' && inputString.charAt(i)<='Z')|| (inputString.charAt(i)=='-'))){
                return false;
            }

        }
        return true;

    }
}
