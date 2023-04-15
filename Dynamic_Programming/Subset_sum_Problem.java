/*
package Dynamic_Programming;

public class Subset_sum_Problem {
    public static void main(String[] args) {
        int[] nums={2,3,7,8,10};
        int target=11;
        System.out.println(is_Subset(nums,target,0,false));
    }
    static boolean is_Subset(int[] nums,int target,int index,boolean present){
        if(target==0){
            present=true;
        }
        return present;
        if(nums[index]<=target){
            is_Subset(nums,target-nums[index],index+1,present);
        }
        return is_Subset(nums,target,index+1,present);
    }
}
*/
