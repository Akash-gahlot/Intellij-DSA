package SelectionSorting;

import java.util.Arrays;

public class SelectionSortOptimised {
    public static void main(String[] args) {
        int[] nums={1,8,9,10,-2};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int lastindex=nums.length-i-1;
            int maxindex=maxelement(nums, 0, lastindex);
            swap(nums,maxindex,lastindex);

        }
    }
    static int maxelement(int[] nums,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] nums,int maxindex,int lastindex){
        int temp=nums[maxindex];
        nums[maxindex]=nums[lastindex];
        nums[lastindex]=temp;
    }
}
