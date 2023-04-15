package MergeSOrting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merger_sort_basics {
    public static void main(String[] args) {
        int[] nums = {2,1};
         nums=mergesort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static int[] mergesort(int[] nums){
        if(nums.length==1){
            return nums;
        }
        int mid= nums.length/2;
       int[] left= mergesort(Arrays.copyOfRange(nums,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=first[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
