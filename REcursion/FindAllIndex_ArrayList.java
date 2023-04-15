package REcursion;

import java.util.ArrayList;

public class FindAllIndex_ArrayList {
    public static void main(String[] args) {
        int[] nums={2,3,1,4,5,6,5};
        int target=5;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=findallindex(nums,target,0,list);
        System.out.println(ans);
        System.out.println(list);

    }
    static ArrayList findallindex(int[] nums,int target,int index,ArrayList<Integer> list){
        if(index== nums.length){
            return list;
        }
        if(target==nums[index]){
            list.add(index);
        }
        return findallindex(nums,target,index+1,list);
    }
}
