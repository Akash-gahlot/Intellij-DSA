package Amazon_Practice.BinarySearch;

public class Pattern_print {
    public static void main(String[] args) {
        int N=3;
        for(int i=1;i<=N;i++){
            if((i!=1) && (i!=N)){
                for(int j=1;j<=N;j++){
                    if(j!=1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*"+" ");
                    }
                }
                System.out.println();
            }
            else{
                for(int k=1;k<=N;k++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }
}
