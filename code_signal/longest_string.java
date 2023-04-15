package code_signal;

import java.util.ArrayList;

public class longest_string {
    public static void main(String[] args) {
        String[] inputArray={"aba","aa","ad","vcd","aba"};
        System.out.println(solution(inputArray).toString());



    }
   static ArrayList<String> solution(String[] inputArray) {
        int max=0;
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i].length()==max){
                arr.add(inputArray[i]);
            }
            if(inputArray[i].length()>max){
                arr.removeAll(arr);
                arr.add(inputArray[i]);
                max=inputArray[i].length();
            }
        }
        return arr;

    }
}
