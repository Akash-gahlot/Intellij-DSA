package REcursion;

public class PRoduct_N_to_1 {
    public static void main(String[] args) {
        int n=5;
        int product=1;
        System.out.println(product(n,product));
    }
    static int product(int n,int product){
        if(n==0){
            return product;
        }
        product=product*n;
       return product(n-1,product);
    }

}
