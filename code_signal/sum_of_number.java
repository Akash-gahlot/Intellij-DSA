package code_signal;

public class sum_of_number {
    public static void main(String[] args) {
        System.out.println(solution("2 apples, 12 oranges"));
    }

   static int solution(String inputString) {
        inputString=inputString.replaceAll("[^0-9]", " ");
        String[] numbers=inputString.split(" ");

        int final_sum=0;
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            String word=numbers[i];
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)>=48 && word.charAt(j)<=57){
                    sum=sum*10+word.charAt(j)-48;
                }
            }
            final_sum+=sum;
            sum=0;
        }
        return final_sum;
   }

}
