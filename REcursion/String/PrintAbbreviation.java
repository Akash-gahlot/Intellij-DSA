package REcursion.String;

public class PrintAbbreviation {
    public static void main(String[] args) {
        String UPS="abc";
        allabbrevation("",UPS,0);
    }
    static void allabbrevation(String PS,String UPS,int count){
        if(UPS.isEmpty()){
            if(count==0){
                System.out.println(PS);
            }
            else{
                System.out.println(PS+count);
            }
            return;

        }
        char ch=UPS.charAt(0);
        if(count>0){
        allabbrevation(PS+count+ch,UPS.substring(1),0);
        }
        else{
            allabbrevation(PS+ch,UPS.substring(1),0);
        }
        allabbrevation(PS,UPS.substring(1),count+1);

    }
}
