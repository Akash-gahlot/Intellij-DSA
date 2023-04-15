package BubbleSortingProblems;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};    //what if the array is already sorted
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubblesort(int[] nums){
        //initialize the outer loop
        boolean checkswapped=false;  //if value remains false it means no swapping is done already is already sorted
        for(int i=0;i< nums.length;i++){
            //initialzie the comparison loop
            //compare j value with it previous value that is j-1;
            for(int j=1;j< nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];   //swapping of values
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    checkswapped=true;
                }
            }
            if(checkswapped==false){
                break;
            } //check if value is false
        }

    }
}
