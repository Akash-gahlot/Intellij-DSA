package Dynamic_Programming;

public class ClimbStairs_2 {
    public static void main(String[] args) {
        int stairs=4;
        int[] memoize=new int[stairs+1];
        System.out.println(count_ways(4,memoize));

    }
    static int count_ways(int stairs,int[] memoize){
        if(stairs==0){
            return 1;
        }
        if(stairs<0){
            return 0;
        }
        if(memoize[stairs]>0){
            return memoize[stairs];
        }
        int call1=count_ways(stairs-1,memoize);
        int call2=count_ways(stairs-2,memoize);
        memoize[stairs]=call1+call2;
        return call1+call2;
    }
}
