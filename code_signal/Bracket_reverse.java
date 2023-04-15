package code_signal;

public class Bracket_reverse {
    public static void main(String[] args) {
        String str="foo(bar(baz))blim";
        System.out.println(solution(str));
    }
    static String solution(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
    }

}
