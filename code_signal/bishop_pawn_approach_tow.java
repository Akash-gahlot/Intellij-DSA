package code_signal;

public class bishop_pawn_approach_tow {
    public static void main(String[] args) {
        System.out.println('1'-48);
    }
    static boolean solution(String bishop ,String pawn){
        int bs=bishop.charAt(0)-'a'+1 +bishop.charAt(1)-48;
        int pn=bishop.charAt(0)-'a'+1 +bishop.charAt(1)-48;
        if(bs%2==0 && pn%2==0){
            return true;
        }
        return false;
    }
}
