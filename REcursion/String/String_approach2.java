package REcursion.String;

public class String_approach2 {
    public static void main(String[] args) {
        String val="bccdabcadb";
        System.out.println(find_substring(val));
    }
    static String find_substring(String US){
        if(US.isEmpty()){
            return "";
        }
        char ch=US.charAt(0);
        if(ch=='c'){
            return find_substring(US.substring(1));
        }
        return ch+find_substring(US.substring(1));
    }
}
