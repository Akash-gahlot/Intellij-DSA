package code_signal;

public class Variable {
    public static void main(String[] args) {
        System.out.println(solution("qq-q"));
    }
    static boolean solution(String name) {
        int count=0;
        if(name.charAt(0)>=48 && name.charAt(0)<=57){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(((name.charAt(i)>=97 && name.charAt(i)<=122))|| ((name.charAt(i)>=97 && name.charAt(i)<=122))|| (name.charAt(i)>=48 && name.charAt(i)<=57) || name.charAt(i)==95){
                count=0;
            }
            else{
                count++;
            }
        }
        if(count==0){
            return true;
        }
        return false;

    }

}
