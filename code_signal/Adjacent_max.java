package code_signal;

public class Adjacent_max {
    public static void main(String[] args) {
        int[] ar={1, 3, 2, 4};
        int k=3;
        System.out.println(solution(ar,k));
    }
    static int solution(int[] inputArray, int k) {
        int max=0;
        int i=0;
        int j=0;
        int sum=0;
        for(i=0;i<inputArray.length;i++){
            sum=0;
            if(i+k>inputArray.length){
                return max;

            }
            for(j=i;j<i+k;j++){
                sum+=inputArray[j];
                }

            max=Math.max(max,sum);

        }
        return max;
    }

}
