package code_signal;

public class beautifull_string {
    public static void main(String[] args) {
        System.out.println(solution("zaa"));
    }
    static boolean solution(String inputString) {
        int[] arr=new int[26];
        for(int i=0;i<inputString.length();i++){
            int val=inputString.charAt(i)-'a';
            arr[val]++;
        }
        if(arr[0]==0){
            return false;
        }
        else{
            int max=arr[0];
            for(int j=1;j<arr.length;j++){
                if(arr[j]!=0 && arr[j]>max){
                    return false;
                }
                else if(arr[j]!=0){
                    max=arr[j];
                }
            }
        }
        return true;

    }

}
