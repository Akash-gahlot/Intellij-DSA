package Striver_DP;

import java.util.HashSet;
import java.util.Set;

public class kth_Max {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        Set<Integer> Set = new HashSet<>();
      //  HashSet<String> set=new HashSet();
        for (int val :arr) {
            Set.add(val);
        }
       // System.out.println(Long.MIN_VALUE);
       // System.out.println(kthMex(3,2,Set));
        System.out.println(kthMex(3,2,0,Set));
    }
//    static int kthMex(int n, int k,Set<Integer> Set) {
//        // add your code here
//        int match=0;
//        while(k>0){
//            for(int i=0;i<n;i++){
//                if(Set.contains(match)){
//                    k=k+1;
//                    break;
//                }
//            }
//            k--;
//            match=match+1;
//        }
//        return match-1;
//    }
    static int kthMex(int n,int k,int match,Set<Integer> Set){
        if(k<=0){
            return match-1;
        }
        for(int i=0;i< Set.size();i++){
            if(Set.contains(match)){
                k=k+1;
                break;
            }
        }
        return kthMex(n,k-1,match+1,Set);
    }
}
