package REcursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] nums={2,4,5,7,8,10,12,15,18,20,22};
        int target=20;
        System.out.println(BinaryRecursion(nums,target,0,nums.length-1));
    }
    static int BinaryRecursion(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                  return  BinaryRecursion(nums,target,mid+1,end);
            }
            else if(target<nums[mid]){
                  return BinaryRecursion(nums,target,start,mid-1);
            }

        return 0;
    }
}
