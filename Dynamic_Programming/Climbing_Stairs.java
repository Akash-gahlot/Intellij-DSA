package Dynamic_Programming;

public class Climbing_Stairs {
    public static void main(String[] args) {
        int target=3;
        int[] nums=new int[target+1];
        System.out.println(count_paths(target,nums));
    }
    static int count_paths(int target,int[] nums){
        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(nums[target]>0){
            return nums[target];
        }
        System.out.println("Target value "+target);
        int f1=count_paths(target-1,nums);
        int f2=count_paths(target-2,nums);
        //int f3=count_paths(target-3,nums);
        nums[target]=f1+f2;
        return f1+f2;
    }
}
