package REcursion.String;

public class String1 {
    public static void main(String[] args) {
       String val="bccdabcadb";
       substring(" ",val);
    }
    static void substring(String PS,String US){  //PS-Process String =" "     //US-Unprocess String=val

        if(US.isEmpty()){
            System.out.println(PS);
            return;
        }
        char ch='a';
        if(US.charAt(0)==ch){
            substring(PS,US.substring(1));
        }else{
            substring(PS+US.charAt(0),US.substring(1));
        }

    }
}
