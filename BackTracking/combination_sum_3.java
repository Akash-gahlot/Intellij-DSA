package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class combination_sum_3 {
    public static void main(String[] args) {
        int[] candidates={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> mainlist=new ArrayList<>();
        List<List<Integer>> ans=combination(candidates,target,0,mainlist,new ArrayList<>());
        System.out.println(ans);

    }
    static List<List<Integer>> combination(int[] candidates, int target, int index, List<List<Integer>> mainlist, ArrayList<Integer> curr){
        if(index==candidates.length){
            if(target==0){
                mainlist.add(new ArrayList<>(curr));
            }
            return mainlist;
        }
        if(candidates[index]<=target){
            if(index==0){
                curr.add(candidates[index]);
            }
            else if(candidates[index]>curr.get(index-1)){
                curr.add(candidates[index]);
            }
            combination(candidates,target-candidates[index],index+1,mainlist,curr);
            curr.remove(curr.size()-1);
        }
        combination(candidates,target,index+1,mainlist,curr);
        return mainlist;

    }
}
