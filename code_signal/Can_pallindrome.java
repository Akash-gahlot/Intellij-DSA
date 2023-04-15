package code_signal;

public class Can_pallindrome {
    public static void main(String[] args) {
        String val="aabb";
       System.out.println('1'-'0');
       // System.out.println(solution(val));
    }
    static boolean solution(String inputString) {
        int[] arr=new int[26];
        int odd_count=0;
        for(int i=0;i<inputString.length();i++){
            int val=inputString.charAt(i)-'a';
            arr[val]++;
        }
        if(inputString.length()%2==0){
            for (int n:
                 arr) {
                if(n%2!=0){
                    return false;
                }

            }
        }
        else if(inputString.length()%2!=0){
            for (int n:
                 arr) {
                if(n%2!=0){
                    odd_count++;
                }
                if(odd_count>1){
                    return false;
                }
            }
        }
        return true;
}

}
