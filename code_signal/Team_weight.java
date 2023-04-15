package code_signal;

public class Team_weight {
    public static void main(String[] args) {
        int[] a={50, 60, 60, 45, 70};
        System.out.println(solution(a).toString());
    }
    static int[] solution(int[] a) {
        int weight1=0;
        int weight2=0;
        int index=0;
        while(index+1<=a.length){
            weight1+=a[index];
            if(index+1<a.length){
                weight2+=a[index+1];
            }
            index+=2;
        }
        return new int[]{weight1,weight2};
    }


}
