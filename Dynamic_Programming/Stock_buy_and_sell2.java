package Dynamic_Programming;

public class Stock_buy_and_sell2 {
    public static void main(String[] args) {
        int[] nums={7,6,4,3,1};
        int profit=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                profit+=nums[i]-nums[i-1];
            }
        }
        System.out.println(profit);
    }
}
