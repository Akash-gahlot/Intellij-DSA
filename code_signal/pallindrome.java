package code_signal;

public class pallindrome {
    public static void main(String[] args) {
        System.out.println(solution("abaa"));
    }
    static String solution(String st) {
        //First check where pallindrome is breaking and if not then return index values
        int count=0;
        int first_index=0;
        int last_index=st.length()-1;
        int match_index=0;
        while(first_index<=last_index){
            if(st.charAt(first_index)!=st.charAt(last_index)){
                break;
            }
            else{
                first_index++;
                last_index--;
                count++;
            }
        }
        if(count==st.length()/2){
            return st;
        }
        else{
            match_index=first_index-1;
            while(st.charAt(first_index)!=st.charAt(last_index)){
                first_index++;
            }
            first_index=first_index-1;
            while(first_index>=0){
                st+=st.charAt(first_index);
                first_index--;
            }
        }
        return st;

    }
}
