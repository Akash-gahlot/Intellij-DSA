package REcursion;

public class Arrays_Is_Sorted_NOt {
    public static void main(String[] args) {
        int [] nums={18,20,19};
        boolean sorted=true;
        int count=0;
        int start=0;
        //System.out.println(check_sorted(nums,sorted,count,start));  //Approach 1
        System.out.println(approach2(nums,start)); //Approach 2
    }
    static boolean check_sorted(int[] nums,boolean sorted,int count,int start){
        if(sorted==false){
            return false;
        }
        if(count==nums.length-1){
            return true;
        }
        if(start+1<nums.length&&nums[start]>nums[start+1]){
            return check_sorted(nums,false,count+1,start);
        }
        return check_sorted(nums,true,count+1,start+1);

    }
    static boolean approach2(int[] nums,int start) {
        if(start== nums.length-1){       //if start  point meets end of array means array is sorted
            return true;
        }
        return nums[start]<nums[start+1] && approach2(nums,start+1); //check agaib if array is sorted or not and increment start value
    }
}
