package TCS;

public class Ballon {
    public static void main(String[] args) {
        char[] arr={'a','b','b','b','c','c','c','a','f','c'};
        int[] arr2=new int[26];
        System.out.println( find_odd_times_ballon(arr,arr2));
    }
    static char find_odd_times_ballon(char[] arr,int[] arr2){
        int odd_count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>=97 && arr[i]<=122){
                int val=arr[i]-'a'+1;
                arr2[val]+=1;
            }
        }
        int i=0;
        for(i=0;i< arr2.length;i++){
            if(arr2[i]%2!=0){
                break;
            }

        }
        return (char)(i+64);
    }
}
