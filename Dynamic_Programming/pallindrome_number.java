package Dynamic_Programming;

public class pallindrome_number {
    public static void main(String[] args) {
        System.out.println(is_Number(121));
    }
    static boolean is_Number(int x){
        String val=""+x;
        String val1="";
        for(int i=val.length()-1;i>=0;i--){
            val1+=val.charAt(i);
        }
        if(val1.equals(val)){
            return true;
        }
        return false;
    }
}
