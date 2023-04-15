package code_signal;

public class min_sum {
    public static void main(String[] args) {
        int[] a={2, 4, 7};
        System.out.println(solution(a));
    }
    static int solution(int[] a) {
        int[] arr=new int[a.length];
        int diff=0;
        for(int i=0;i<a.length;i++){
            diff=0;
            for(int j=0;j<a.length;j++){
                diff+=Math.abs(a[i]-a[j]);
            }
            arr[i]=diff;
        }
        int min_index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[min_index]){
                min_index=i;
            }
        }
        return a[min_index];

    }
}
