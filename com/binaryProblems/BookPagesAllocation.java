package com.binaryProblems;
import java.util.*;
public class BookPagesAllocation {
    public static void main(String[] args) {
        int[] nums={10,20,30,40};
        int k=2;
        System.out.println(Search(nums,k));
    }
    static int Search(int[] nums,int k) {
        int end = 0;
        int start = 0;
        for(int i:nums){
            end+=i;
            start=Math.max(start,i);
        }
        int mid=0;
        while (start <end) {
            int student = 1;
            int sum = 0;
           mid = start + (end - start)/2;
            for (int val : nums) {
                if (sum + val > mid) {
                    sum = val;
                    student++;
                } else {
                    sum = sum + val;
                }
            }
            if (student > k) {
                start = mid + 1;
            } else {
                end = mid ;
            }
        }
        return mid;
    }

}
