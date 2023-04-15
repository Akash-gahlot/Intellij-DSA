package REcursion.String;

public class Permutation {
    public static void main(String[] args) {
        String word="abc";
        permutation("",word);
        //System.out.println(permutationcount("",word));
    }
    static void permutation(String PS,String UPS){
        if(UPS.isEmpty()){
            System.out.println(PS);
            return;
        }
        char ch=UPS.charAt(0);
        for(int i=0;i<=PS.length();i++){
            String first=PS.substring(0,i);
            String second=PS.substring(i,PS.length());
            permutation(first+ch+second,UPS.substring(1));
        }
    }
    static int permutationcount(String PS,String UPS){
        if(UPS.isEmpty()){

            return 1;
        }
        int count=0;
        char ch=UPS.charAt(0);
        for(int i=0;i<=PS.length();i++){
            String first=PS.substring(0,i);
            String second=PS.substring(i,PS.length());
            count=count+permutationcount(first+ch+second,UPS.substring(1));
        }
        return count;
    }
}
