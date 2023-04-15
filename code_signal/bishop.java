package code_signal;

public class bishop {
    public static void main(String[] args) {
       // System.out.println('1'-48);
     System.out.println(solution("h1","h3"));
    }
    static boolean solution(String bishop, String pawn) {
        if(check_upper_left_diagonal(bishop,pawn)){
            return true;
        }
        else {
            if((check_upper_right_diagonal(bishop,pawn))){
                return true;
            }
            else{
                if((check_down_left_diagonal(bishop,pawn))){
                    return true;
                }
                else {
                    if((check_down_right_diagonal(bishop,pawn))){
                        return true;
                    }
                }

            }
        }
        return false;
    }
    static boolean check_upper_left_diagonal(String bishop, String pawn){
        int val=bishop.charAt(1)-48;
        char ch=bishop.charAt(0);
        while((ch>='a' && ch<='h')&&( val>=1 && val<=8)){
            String str=""+ch+val;
            if(str.equals(pawn)){
                return true;
            }
            else{
                int chr=(int)ch-1;
                ch=(char)chr ;
                val+=1;
            }
        }
        return false;
    }
    static boolean check_upper_right_diagonal(String bishop, String pawn){
        int val=bishop.charAt(1)-48;
        char ch=bishop.charAt(0);
        while((ch>='a' && ch<='h')&&( val>=1 && val<=8)){
            String str=""+ch+val;
            if(str.equals(pawn)){
                return true;
            }
            else{
                int chr=(int)ch+1;
                ch=(char)chr ;
                val+=1;
            }
        }
        return false;
    }
    static boolean check_down_left_diagonal(String bishop, String pawn){
        int val=bishop.charAt(1)-48;
        char ch=bishop.charAt(0);
        while((ch>='a' && ch<='h')&&( val>=1 && val<=8)){
            String str=""+ch+val;
            if(str.equals(pawn)){
                return true;
            }
            else{
                int chr=(int)ch-1;
                ch=(char)chr ;
                val=val-1;
            }
        }
        return false;
    }
    static boolean check_down_right_diagonal(String bishop, String pawn){
        int val=bishop.charAt(1)-48;
        char ch=bishop.charAt(0);
        while((ch>='a' && ch<='h')&&( val>=1 && val<=8)){
            String str=""+ch+val;
            if(str.equals(pawn)){
                return true;
            }
            else{
                int chr=(int)ch+1;
                ch=(char)chr ;
                val=val-1;
            }
        }
        return false;
    }
    }



