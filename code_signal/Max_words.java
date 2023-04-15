package code_signal;

public class Max_words {
    public static void main(String[] args) {

    }
   static String solution(String text) {
        String str="";
        int max_count=0;
        int count=0;
        String return_str="";
        for(int i=0;i<text.length();i++){
            if(!((text.charAt(i)>=65 && text.charAt(i)<=90) || (text.charAt(i)>=97 && text.charAt(i)<=122))){
                if(count>max_count){
                    max_count=count;
                    return_str=str;
                    str="";
                    count=0;
                }
                count=0;
                str="";

            }
            else if((text.charAt(i)>=65 && text.charAt(i)<=90) || (text.charAt(i)>=97 && text.charAt(i)<=122)){
                str+=text.charAt(i);
                count++;

            }
        }
        if(return_str.isEmpty()){
            return text;
        }
        return return_str;

    }

}
