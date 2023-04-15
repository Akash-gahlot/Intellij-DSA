package SelectionSorting;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int min=nums[i];
            for(int j=i;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    int temp=min;
                    nums[j]=nums[i];
                    nums[i]=temp;
                }


            }
        }

    }
}
