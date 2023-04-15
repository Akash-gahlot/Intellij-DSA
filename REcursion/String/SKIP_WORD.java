package REcursion.String;

public class SKIP_WORD {
    public static void main(String[] args) {
        String sentence="my name is akash gahlot";
        String name="akash";
        System.out.println(SkipName(name,sentence));
    }
    static String SkipName(String name,String sentence){
        if(sentence.isEmpty()){
            return "";
        }
        if(sentence.startsWith(name)){
            return SkipName(name,sentence.substring(5));
        }
        return sentence.charAt(0)+SkipName(name,sentence.substring(1));
    }
}
