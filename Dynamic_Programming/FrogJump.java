package Dynamic_Programming;

public class FrogJump {
    public static void main(String[] args) {
        System.out.println(countways(5));
    }
    static  int countways(int stair){
        if(stair==0){
            return 0;
        }
        int left=countways(stair-1);
        int right=Integer.MAX_VALUE;
        if(stair>1){
             right=countways(stair-2);
        }

        return Math.min(left,right);
    }
}
