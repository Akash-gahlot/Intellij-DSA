package Striver_DP;

import java.util.ArrayList;
import java.util.List;

public class triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle= new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(-1);
        triangle.add(list1);
        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(3);
        triangle.add(list2);
        List<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(-1);
        list3.add(-3);
        triangle.add(list3);
//        List<Integer> list4=new ArrayList<>();
//        list4.add(4);
//        list4.add(1);
//        list4.add(8);
//        list4.add(3);
//        triangle.add(list4);
        System.out.println(minimumTotal(triangle,0,0));
//        for (List<Integer> main: triangle) {
//            for (int val:main) {
//                System.out.print(val+" ");
//            }
//            System.out.println();
//        }
    }
    static int minimumTotal(List<List<Integer>> triangle,int sum,int index) {
        if(index>triangle.size()-1){
            return sum;
        }
        sum+=calculate_min(triangle.get(index),0,100000);
        return minimumTotal(triangle,sum,index+1);
    }
    static int calculate_min(List<Integer> list,int index,int min){
        if(index>list.size()-1){
            return min;
        }
        min=Math.min(min,list.get(index));
        return calculate_min(list,index+1,min);
    }
}
