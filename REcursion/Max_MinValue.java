package REcursion;

import java.util.Arrays;

public class Max_MinValue {
    public static void main(String[] args) {
        int[] nums={1, 4, 3, -5, -4, 8, 6};
        max_mins_search(nums,0,0,0);




    }
    static int[]  max_mins_search(int[] nums,int max,int min,int index){
        if(index> nums.length-1){
            System.out.println("Max "+nums[max]+" Min :"+nums[min]);
            return nums;
        }
        if(nums[index]>nums[max]){
            max=index;
        }
        if(nums[index]<nums[min]){
            min=index;
        }
        return max_mins_search(nums,max,min,index+1);
    }
}
