
package REcursion.String;

public class  Leetcode_Sum {
    public static void main(String[] args) {
        int[] nums={3,5,6,7};
        int target=9;
        System.out.println(numSubseq(nums,target));

    }
    static int numSubseq(int[] nums, int target) {
        return Count(nums,target,"",0,0);
    }
    static int Count(int[] nums,int target,String PS,int index,int count){
        count=count;
        if(index==nums.length-1){
            int sum=0;
            if(!PS.isEmpty()){
                if(PS.length()==1){
                    sum=sum+(int)PS.charAt(0)-48;
                }
                else {
                    sum = sum + (int) PS.charAt(0) + (int) PS.charAt(PS.length() - 1) - 2 * 48;
                }
                if(sum<=target){
                    count++;
                }
            }
            return count;

        }
        Count(nums,target,PS,index+1,count);
        Count(nums,target,PS+nums[index],index+1,count);
        return count;


    }
}
