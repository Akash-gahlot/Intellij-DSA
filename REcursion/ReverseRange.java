package REcursion;

public class ReverseRange {
    public static void main(String[] args) {
        printReverseRange(20,1);

    }
    static void printReverseRange(int a,int b){
        if(a==1){
            return;
        }
        if(a-1!=b){
            System.out.println(a-1);
        }
        printReverseRange(a-1,b);
    }
}
