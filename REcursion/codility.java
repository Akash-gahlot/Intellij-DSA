package REcursion;

public class codility {
    public static void main(String[] args) {
        int n=670;
        int target=5;
        double sum=0;
        int count=0;
        if(n==0){
            sum=sum+target*Math.pow(10,1);
        }
        while(n>0){
            int rem=n%10;
            sum=sum+rem*Math.pow(10,count);
            count++;
            n=n/10;
            if(rem<target){
                sum=sum+target*Math.pow(10,count);
                count++;
            }
        }
        System.out.println(sum);
    }

}
