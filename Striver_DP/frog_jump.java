package Striver_DP;

import java.util.HashMap;
import java.util.HashSet;

public class frog_jump {
    public static void main(String[] args) {
        int[] stones={0,1,2,3,4,8,9,11};
        System.out.println(canCross(stones));
    }
    static boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<stones.length;i++){
            map.put(stones[i],new HashSet<>());
        }
        map.get(stones[0]).add(1);
        for(int i=0;i<stones.length;i++){
            int curr_stone=stones[i];
            HashSet<Integer> jumps=map.get(curr_stone);
            for (int jump : jumps) {
                int reach_stone=curr_stone+jump;
                if(reach_stone==stones[stones.length-1]){
                    return true;
                }
                if(map.containsKey(reach_stone)==true){
                    if(jump-1>0) {
                        map.get(reach_stone).add(jump - 1);
                    }
                    map.get(reach_stone).add(jump);
                    map.get(reach_stone).add(jump+1);
                }
            }
        }
        return false;
    }
}
