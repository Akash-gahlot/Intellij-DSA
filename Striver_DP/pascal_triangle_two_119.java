package Striver_DP;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle_two_119 {
    public static void main(String[] args) {
        int n=4;
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=triangle(n,list,1);
        for (int val:ans) {
            System.out.print(val+" ");
        }
    }
    static List<Integer> triangle(int numRows, List<Integer> nums,int index){
        if(index==numRows){
            return nums;
        }
        List<Integer> create=new ArrayList<>();
        nums=find(nums,create,0,index+1);
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
