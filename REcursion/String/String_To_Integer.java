package REcursion.String;

public class String_To_Integer {
    public static void main(String[] args) {
        String s="with words 43";
        System.out.println(string_to_int(s));


    }
    static int string_to_int(String s){
        double sum=0;
        int count=0;
        if((int)s.charAt(0)>57 || (int)s.charAt(0)<49){
            return 0;
        }
        else{
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>=49 && s.charAt(i)<=57){
                sum=sum+(s.charAt(i)-'0')*Math.pow(10,count);
                count++;
            }
            if(s.charAt(i)==45){
                return -1*(int)sum;
            }
        }}
        return (int)sum;

    }
}
