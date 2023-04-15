package Dynamic_Programming.Sliding_windows;

import java.util.Arrays;

public class Max_Of_subarrays {
    public static void main(String[] args) {
        int[] nums={9, 7, 2, 4, 6, 8, 2, 1, 5};
        int size=3;
        int max=0;
        int[] nums2=new int[nums.length-1];
        for(int i=0;i<size;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

    }
}
