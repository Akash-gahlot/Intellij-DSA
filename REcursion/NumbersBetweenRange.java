package REcursion;

public class NumbersBetweenRange {
    public static void main(String[] args) {
        printbetweebn(5,10); //print  the numbers in given specified range;

    }
    static void printbetweebn(int a,int b){
        if(b==a){
            return;
        }

        if(a+1!=b){

            System.out.println(a+1);
        }

        printbetweebn(a+1,b);
    }
}
