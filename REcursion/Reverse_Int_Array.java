package REcursion;

import java.util.Arrays;

public class Reverse_Int_Array{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int[] ans=reverse(nums,0);
        System.out.println(Arrays.toString(ans));
    }
    static int[] reverse(int[] nums,int index){
        if(index> nums.length/2){
            return nums;
        }
        swap(nums,index);
        return reverse(nums,index+1);
    }
    static void swap(int[]nums,int index){
        int temp=nums[index];
        nums[index]=nums[nums.length-index-1];
        nums[nums.length-index-1]=temp;
        return;
    }
}
