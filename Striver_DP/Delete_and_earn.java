package Striver_DP;

public class Delete_and_earn {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,4,5,5,5,6};
        //int output=6;
        System.out.println(max_point(nums,-100000,0));
    }
    static int max_point(int[] nums,int points,int index){
        while (index<= nums.length-1){
           // int sum=nums[index];
            int count=nums[index];
            for(int i=0;i< nums.length;i++){
                if(i!=index){
                    if(nums[i]==nums[index]-1 || nums[i]==nums[index]+1|| nums[i]==nums[index]){
                        count+=0;
                    }
                    else{
                        count+=nums[i];
                    }
                }
            }
            points=Math.max(points,count);
            index++;
            count=0;
        }
        return points;
    }
}
