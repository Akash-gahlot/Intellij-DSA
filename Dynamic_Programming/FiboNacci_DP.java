package Dynamic_Programming;

public class FiboNacci_DP {
    public static void main(String[] args) {
        int target=6;
        //System.out.println(find_fibo(target));
        int[] nums=new int[target+1];
        System.out.println(find_fibo_memoizi(target,nums));
    }
    static int find_fibo(int target){
        if(target<=1){
            return target;
        }
        System.out.println("Target value "+target);
        int fb1=find_fibo(target-1);
        int fb2=find_fibo(target-2);
        return fb1+fb2;
    }
    static int find_fibo_memoizi(int target,int[] nums){
        if(target<=1){
            return target;
        }
        if(nums[target]!=0){
            return nums[target];
        }
        System.out.println("Target value "+target);
        int fb1=find_fibo_memoizi(target-1,nums);
        int fb2=find_fibo_memoizi(target-2,nums);
        nums[target]=fb1+fb2;
        return fb1+fb2;

    }
}
