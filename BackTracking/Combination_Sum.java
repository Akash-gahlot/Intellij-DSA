package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int[] nums={2};
        int target=1;
        ArrayList<List<Integer>> mainlist=new ArrayList<>();
        ArrayList<List<Integer>> ans=combinationsum(nums,0,target,mainlist,new ArrayList<Integer>());
        System.out.println(ans);

    }
    static ArrayList<List<Integer>> combinationsum(int[] nums,int index,int target,ArrayList<List<Integer>> mainlist,ArrayList<Integer> curr){
        if(index==nums.length){
            if(target==0){
                mainlist.add(new ArrayList<>(curr));
            }
            return mainlist;
        }
        if(nums[index]<=target){
            curr.add(nums[index]);
            combinationsum(nums,index,target-nums[index],mainlist,curr);
            curr.remove(curr.size()-1);

        }
        combinationsum(nums,index+1,target,mainlist,curr);
        return mainlist;

    }


    }

