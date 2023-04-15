package code_signal;

public class pair_product {
    public static void main(String[] args) {
        int[] arr={3,6,-2,-5,7,3};
        System.out.println(product(arr));
    }
    static int product(int[] arr){
        int product_value= arr[0];
        for(int i=0;i<=arr.length-2;i++){
            int val=arr[i]*arr[i+1];
            product_value=Math.max(val,product_value);
        }
        return product_value;
    }
}
