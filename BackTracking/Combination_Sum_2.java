package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_2 {
    public static void main(String[] args) {
        int k=9;
        int n=45;
        ArrayList<List<Integer>> mainlist=new ArrayList<>();
        ArrayList<List<Integer>> ans=combination_sum_2(k,n,1,new ArrayList<>(),mainlist);
        System.out.println(ans);

    }
    static ArrayList<List<Integer>> combination_sum_2(int k,int n,int index,ArrayList<Integer> curr,ArrayList<List<Integer>> mainlist){
        if(curr.size()==k){
        if(n==0){
            mainlist.add(new ArrayList<>(curr));
        }
        return mainlist;
        }
        if(index>9){
            return mainlist;
        }
        if(index<=n){
            curr.add(index);
            combination_sum_2(k,n-index,index+1,curr,mainlist);
            curr.remove(curr.size()-1);
        }
        combination_sum_2(k,n,index+1,curr,mainlist);
        return mainlist;
    }
}
