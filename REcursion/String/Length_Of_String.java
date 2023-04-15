package REcursion.String;

public class Length_Of_String {
    public static void main(String[] args) {
        String word="akash";
        System.out.println(findlength(word));
    }
    static int findlength(String word){
        if(word.isEmpty()){
            return 0;
        }
        return 1+findlength(word.substring(1));
    }
}
