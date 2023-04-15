package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] nums={11,5,3,7,9,10,-1};
        int end= nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<end;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

}
