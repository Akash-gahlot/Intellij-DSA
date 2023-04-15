package REcursion;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums={3,4,2,1,8,9,10};
        int target=9;
        int start=0;
        System.out.println(indexSearch(nums,target,start));
    }
    static int indexSearch(int[] nums,int target,int start){
        if(target==nums[start]){
            return start;    //target is found
        }
        if(start==nums.length-1){   //target is not present in whole array
            return -1;
        }
        return indexSearch(nums,target,start+1);    //check again in array if target is found or not
    }

}
