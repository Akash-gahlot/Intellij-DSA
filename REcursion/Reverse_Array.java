package REcursion;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int n= nums.length-1;
        reverseArray(nums,0,n);

    }
    static void reverseArray(int[] nums ,int index,int n){
        if(index== nums.length/2){
            System.out.println(Arrays.toString(nums));
            return;
        }
        int temp=nums[n-index];
        nums[n-index]=nums[index];
        nums[index]=temp;
        reverseArray(nums,index+1,n);
    }
}
