package Odin_projects;

public class problem1 {
    public static void main(String[] args) {
        printname(15);

    }
    static void printname(int n){
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println( i+" FizzBuzz");
            }
            else if(i%5==0){
                System.out.println(i+" Buzz");
            }
            else if(i%3==0){
                System.out.println( i+" Fizz");
            }
            else{
                System.out.println(i+" NO");
            }
        }

    }
}
