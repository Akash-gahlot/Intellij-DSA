package code_signal;

public class even_digits {
    public static void main(String[] args) {
        int n=248322;
        System.out.println(solution(n));
    }
   static boolean solution(int n) {
        boolean even_present=true;
        int odd_count=0;
        while(n!=0){
            int rem=n%10;
            if(rem%2!=0){
                return false;
            }
            n=n/10;
        }

        return even_present;
    }
}
