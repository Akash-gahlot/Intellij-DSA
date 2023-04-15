package Striver_DP;

public class house_robber {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(rob(nums));
    }

    static int rob(int[] nums) {

        int ans1= max_search(nums,nums[0],0,1,false);
        int ans2=max_search(nums,nums[1],0,2,true);
        return Math.max(ans1,ans2);
    }
    static int max_search(int[] nums,int incl,int excl,int index,boolean exclude_first){
        if(!exclude_first){
            if(index> nums.length-2){
                return incl;
            }
        }
        else{
            if(index> nums.length-1){
                return incl;
            }
        }
        int val=Math.max(excl+nums[index],incl);
        excl=incl;
        incl=val;
        index++;
        return max_search(nums,incl,excl,index,exclude_first);
    }
}
