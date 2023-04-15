package REcursion.String;

public class Phone_number {
    public static void main(String[] args) {
        String val="23";
        //combination("",val);
        System.out.println(val.charAt(0)-'0');
    }

/*   static void combination(String PS,String UPS){
        if(UPS.isEmpty()){
            System.out.println(PS);
            return;
        }
        int digit=UPS.charAt(0)-'1';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            combination(PS+ch,UPS.substring(1));
       }

    }*/
}
