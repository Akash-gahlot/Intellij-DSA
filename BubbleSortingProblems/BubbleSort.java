package BubbleSortingProblems;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={5,6,10,2,3,1};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void bubblesort(int[] nums){
        //initialize the outer loop
        for(int i=0;i< nums.length;i++){
            //initialzie the comparison loop
            //compare j value with its previous value that is j-1;
            for(int j=1;j< nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];   //swapping of values
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
}
