package Striver_DP;

public class subarray_sum_equals_k {
    public static void main(String[] args) {
        int index=-1;
        int[] nums={1,1,1};
        int k=2;
        System.out.println(find(nums,k,nums.length,0,0));
        //System.out.println(subarraySum(nums,k,-1,0));
    }
//    static int subarraySum(int[] nums, int k,int index,int count) {
//        if(index>nums.length-1){Math.abs(count-nums[index]
//            return count;
//        }
//        count+=find(nums,k,index+1,0,index+1,0);
//        return subarraySum(nums,k,index+1,count);
//    }
//    static int find(int[] nums,int k,int i,int count,int index,int take){
//        if(k==0){
//                return count+=1;
//        }
//        if(i>=nums.length && k==0){
//            return count+=1;
//        }
//        if(i>= nums.length){
//            return count;
//        }
//        int not_take=find(nums,k,i+1,count,index,take);
//        if(nums[i]<=k)
//             take=find(nums,Math.abs(k-nums[i]),i+1,count,index,take);
//
//        return not_take+take;
//    }
    static int find(int[] nums,int k,int index,int count,int take){
        if(k==0){
            return 1;
        }
        if(index==0 && k==nums[0]){
            return 1;
        }
        if(index==0){
            return count;
        }
        int not_take=find(nums,k,index-1,count,take);
        if(nums[index]<=k){
            take=find(nums,k-nums[index],index-1,count,take);
        }
        return count=count+not_take+take;
    }
}
