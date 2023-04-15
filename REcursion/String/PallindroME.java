package REcursion.String;

public class PallindroME {
    public static void main(String[] args) {
      // System.out.println(pallindrome_check("aaaaaa"));
       System.out.println(pallindrome_check_2("aaa"));

    }
    static boolean pallindrome_check(String val){
        String reverse_val="";
        for(int i=val.length()-1;i>=0;i--){
            reverse_val+=val.charAt(i);
        }
        if(reverse_val.equals(val)){
            return true;
        }

        return false;
    }
    static boolean pallindrome_check_2(String val){
        int i=0;
        while(i<val.length()/2){
            if(val.charAt(i)!=val.charAt(val.length()-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
