package REcursion;

public class Solution {
    public static void main(String[] args) {
        String S="parks";
        String T="park";
        System.out.println(solution(S,T));
    }
    static String solution(String S,String T){
         if(S.length()==T.length()){
            String swap="SWAP ";
            int j=0;
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)!=T.charAt(i)){
                    swap=swap+S.charAt(i)+" ";
                    j++;
                }
            }
            return swap;
        }
        else if(S.charAt(0)==T.charAt(1)){
            String insert="INSERT ";
            for(int i=0 ;i<S.length();i++){
                if(S.charAt(i)==T.charAt(i+1)){
                   continue;
                }
            }
            return insert+T.charAt(0);
        }
        else if(S.charAt(0)==T.charAt(0)){
            String remove ="REMOVE ";
            for(int i=0;i<T.length();i++){
                if(T.charAt(i)==S.charAt(i)){
                    continue;
                }
            }
            return remove+S.charAt(S.length()-1);
        }
        return "IMPOSSIBLE";
    }
}
