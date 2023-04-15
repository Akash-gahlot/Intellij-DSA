package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] nums={100,11,5,3,7,9,10,-1};
        int start=0;
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=start;i< nums.length;i++){
            for(int j=i;j< nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    index=j;
                }
            }
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            min=Integer.MAX_VALUE;
            index=-1;
            start++;
        }
        System.out.println(Arrays.toString(nums));
    }

}
