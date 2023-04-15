package Amazon_Practice.BinarySearch;

public class Two_Table {
    public static void main(String[] args) {
        int a=1;
        int n=10;

        printTwoTable(a,n);
    }
    static void printTwoTable(int i,int value){
        if(i>10){
            return;
        }
        System.out.println(value*i);
        i++;
        printTwoTable(i++,value);
    }
}
