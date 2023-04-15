package code_signal;
import java.util.*;

public class encoded_string {
    public static void main(String[] args) {
        solution("aabbbc");
    }
    static void solution(String s) {

        String newstr="";
        Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();
        for(int i=0;i<s.length();i++){
            Integer c = hm.get(s.charAt(i));
            if(hm.get(s.charAt(i))==null){
                hm.put(s.charAt(i),1);
            }
            else{
                hm.put(s.charAt(i),++c);
            }

        }

        System.out.println(hm.toString());
    }


}
