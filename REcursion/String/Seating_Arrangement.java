package REcursion.String;

public class Seating_Arrangement {
    public static void main(String[] args) {
        String UPS="BMG";
        String PS="";
        seating_Arrangement(PS,UPS);
    }
    static void seating_Arrangement(String PS,String UPS){
        if(UPS.isEmpty()){
            System.out.println(PS);
            return;
        }
        char ch=UPS.charAt(0);
        seating_Arrangement(PS+ch,UPS.substring(1));
    }
}
