package code_signal;

public class Repace_char {
    public static void main(String[] args) {
        System.out.println(solution("crazy"));
    }
    static String solution(String inputString) {
        String newstring="";
        for(int i=0;i<inputString.length();i++){
            int val=inputString.charAt(i)-96;
            val=val%26+1;
            char new_char=(char)(96+val);
            newstring+=new_char;
        }
        return newstring;
    }

}
