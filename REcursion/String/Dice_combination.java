package REcursion.String;

public class Dice_combination {
    public static void main(String[] args) {
        int target=4;
        dicecombination("",target);
    }
    static void dicecombination(String PS,int target){
        if(target==0){
            System.out.println(PS);
        }
        for(int i=1;i<=6&&i<=target;i++){
            dicecombination(PS+i,target-i);
        }
    }
}
