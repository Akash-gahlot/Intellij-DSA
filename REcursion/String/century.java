package REcursion.String;

public class century {
    public static void main(String[] args) {
        System.out.println(century(1710));
    }
    static int century(int val){
        int newval=0;

            newval=val/100;
            int rem=val%100;
            if(rem>0){
                newval+=1;
        }
            return newval;
    }
}
