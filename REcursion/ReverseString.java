package REcursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s={'h','a','n','n','a','h'};
       reverseString(s);
        System.out.println(Arrays.toString(s));

    }
    static void reverseString(char[] s) {
       reverse(s,0);

    }
    static void reverse(char[] s,int index){
            if(index==s.length/2){
                return;
            }
            char val=s[index];
            s[index]=s[s.length-index-1];
            s[s.length-index-1]=val;
            reverse(s,index+1);
        }

}

