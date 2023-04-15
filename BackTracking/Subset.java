package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] nums={1,2,3};
/*        String word="abc";
        List<List<String>> mainlist=new ArrayList<>();
        sets("",word,mainlist);
        System.out.println(mainlist);
        */
        List<Integer> list = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        subsequence(0, list, nums, ans);
        System.out.println(ans);

    }
   /* static void sets(String PS, String UPS,List<List<String>> mainlist){
        List<String> newlist=new ArrayList<>();
        if(UPS.isEmpty()){
            newlist.add(PS);
            mainlist.add(newlist);
            return;
        }
        char ch=UPS.charAt(0);
        sets(PS,UPS.substring(1),mainlist);
        sets(PS+ch,UPS.substring(1),mainlist);
    }*/
   static void subsequence(int index, List<Integer> list, int[] nums, List<List<Integer>> ans){
       if(index==nums.length){
           ans.add(new ArrayList<>(list));
           return;
       }
       list.add(nums[index]);
       subsequence(index+1,list,nums,ans);
       list.remove(list.size()-1);
       subsequence(index+1,list,nums,ans);
   }
}
