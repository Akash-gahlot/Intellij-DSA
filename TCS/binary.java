package TCS;

import javax.crypto.spec.PSource;

public class binary {
    public static void main(String[] args) {
        int val=10;
        String str="";
        while(val>0){
            int rem=val%2;
            val=val/2;
            str+=rem;
        }
        System.out.println(str);
    }

}
