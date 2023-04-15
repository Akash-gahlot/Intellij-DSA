package Striver_DP;

public class Target_sum {
    public static void main(String[] args) {
        int[] nums={1};
        int target=1;
        int index=0;
        System.out.println(ways(nums,target,index,0));
    }
    static int ways(int[] nums,int target,int index,int count){
        if(index>nums.length-1){
            if(count==target){
                return 1;
            }
            return 0;
        }
        count+=nums[index];
        int minus=-1*count+ways(nums,target,index+1,-1*count);
        int plus=count+ways(nums,target,index+1,count);
        return plus+minus;
    }
}
