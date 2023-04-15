package REcursion;

import java.util.ArrayList;

public class Fiboseries {
    public static  void main(String[] args) {
        System.out.println(fiboseries(7));
    }
    static ArrayList<Integer>  fiboseries(int n){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int a=0;
        int b=1;
        while(i<n){
            list.add(a);
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
        return list;
    }


}
