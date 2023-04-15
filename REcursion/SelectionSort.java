package REcursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={6,9,4,7,8,3,2,5};
        int row= nums.length-1;
        selectionsorting(nums,row,0,0);
        System.out.println(Arrays.toString(nums));
    }
    static void selectionsorting(int[] nums,int row,int index,int max){
        if(row<0){
            return;
        }
        if(index<=row){
            if(nums[index]>nums[max]){
                selectionsorting(nums,row,index+1,index);
            }
            else{
                selectionsorting(nums,row,index+1,max);
            }
        }
        else{
            int temp=nums[max];
            nums[max]=nums[index-1];
            nums[index-1]=temp;
        }
        selectionsorting(nums,row-1,0,0);
    }
}
