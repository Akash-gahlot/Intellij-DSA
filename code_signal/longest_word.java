package code_signal;

public class longest_word {
    public static void main(String[] args) {
       solution("Ready, steady, go!");
    }
   static void solution(String text) {
        text=text.replaceAll("[^a-zA-Z]", " ");
       System.out.println(text);
        String[] words=text.split(" ");
        String max=words[0];
        for(int i=1;i<words.length;i++){
            if(words[i].length()>max.length()){
                max=words[i];
            }
        }


    }

}
