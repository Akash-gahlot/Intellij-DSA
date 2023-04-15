package code_signal;

public class cout_character {
    public static void main(String[] args) {
        String s1="aabcc";
        String s2="adcaa";
        System.out.println(solution(s1,s2));

    }
    static int solution(String s1, String s2) {
        int count=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                    s1 = s1.substring(0, i) + '_'
                            + s1.substring(i + 1);
                    s2 = s2.substring(0, j) + '_'
                            + s2.substring(j + 1);
                    break;
                }
            }

        }
        return count;
    }
}
