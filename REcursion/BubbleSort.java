package REcursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,7,6};
        int count1= nums.length-1;
        int count2=0;
        bubblesort(nums,count1,count2);
        System.out.println(Arrays.toString(nums));
    }
    static void bubblesort(int[] nums,int count1,int count2){
        if(count1<0){
            return;
        }
        if(count2<=count1){
        if(count2+1<nums.length&&nums[count2]>nums[count2+1]){
            int temp=nums[count2+1];
            nums[count2+1]=nums[count2];
            nums[count2]=temp;
        }
        bubblesort(nums,count1,count2+1);
        }
        else{
            bubblesort(nums,count1-1,0);
        }
    }

}
