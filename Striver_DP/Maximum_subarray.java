package Striver_DP;

public class Maximum_subarray {
    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        int max=-100000;
        int sum=0;

        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
            if(sum<0){
                sum=0;
            }
            else{
                sum=sum;
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }

}
