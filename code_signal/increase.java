package code_signal;

public class increase {
    public static void main(String[] args) {
        int[] inputarray={-1000, 0, -2, 0};
        System.out.println(solution(inputarray));
    }
   static int solution(int[] inputArray) {
        int count=0;
        for(int i=0;i<inputArray.length-1;i++){
            int increase=0;
            if(inputArray[i+1]<=inputArray[i]){
                increase=0;
                increase=Math.abs(inputArray[i+1]-inputArray[i])+1;
                count+=increase;
                inputArray[i+1]=inputArray[i+1]+increase;

            }
        }
        return count;
    }

}
