package Striver_DP;

import java.util.ArrayList;
import java.util.List;

public class triangle2 {
    public static void main(String[] args) {
        List<List<Integer>> triangle= new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        triangle.add(list1);
        List<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        triangle.add(list2);
        List<Integer> list3=new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        triangle.add(list3);
        List<Integer> list4=new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        triangle.add(list4);
        int[] arr=new int[triangle.get(triangle.size()-1).size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=triangle.get(triangle.size()-1).get(i);
        }
      //  List<Integer> main=triangle.get(triangle.size()-1);
       // System.out.println(minimumTotal(triangle,main,triangle.size()-2));
        System.out.println(minimumTotal(triangle,arr,triangle.size()-2));
    }
    static int minimumTotal(List<List<Integer>> triangle,int[] arr,int index){
        if(index<0){
            return arr[0];
        }
        for(int i=0;i<triangle.get(index).size();i++){
           // main.remove(i);
            arr[i]=min(triangle.get(index),arr,i);
           // main.add(i,min(triangle.get(index),arr,i));
        }
        for (int n:arr) {
            System.out.print(n+" ");
        }
        System.out.println();
        return minimumTotal(triangle,arr,index-1);
    }
    static int min(List<Integer> sublist, int[] main, int ind){
        return sublist.get(ind)+Math.min(main[ind],main[ind+1]);
    }
}
