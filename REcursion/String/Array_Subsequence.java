package REcursion.String;

import java.util.ArrayList;

public class Array_Subsequence {
    public static void main(String[] args) {
        int[] nums={3,1,2,3,6};
        int target=6;
        ArrayList<String> ans=new ArrayList<>();
        ans=sequence(nums,"",0,ans,target);
        System.out.println(ans);
    }
    static ArrayList<String> sequence(int[] nums, String PS, int index, ArrayList<String> list,int target){
        if(index== nums.length){
            int sum=0;
            for(int i=0;i<PS.length();i++){
                sum=sum+(int)PS.charAt(i)-48;
            }
           if(sum==target){
               list.add(PS);
           }
            return list;
        }
        sequence(nums,PS,index+1,list,target);
        sequence(nums,PS+nums[index],index+1,list,target);
        return list;

    }
}
