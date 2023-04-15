package Striver_DP;

import java.util.ArrayList;
import java.util.List;

public class Pascal_triangle_118 {
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> nums=new ArrayList<>();
        List<Integer> nums2=new ArrayList<>();
        nums2.add(0,1);
        nums.add(0,nums2);
        List<List<Integer>> ans=triangle(n,nums,1);
        for (List<Integer> list:ans) {
            for (int val:list){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> triangle(int numRows, List<List<Integer>> nums,int index){
        if(index==numRows){
            return nums;
        }
        List<Integer> create=new ArrayList<>();
         nums.add(index,find(nums.get(index-1),create,0,index+1));
         return triangle(numRows,nums,index+1);
    }
    static List<Integer> find(List<Integer> list,List<Integer> create,int i ,int index){
        if(i==index){
            return create;
        }
        if(i==0 || i==index-1){
            create.add(i,1);
        }
        else {
            create.add(i,list.get(i-1)+list.get(i));
        }
        return find(list,create,i+1,index);
    }
}
