package Amazon_Practice.BinarySearch;

public class First_one_search {
    public static void main(String[] args) {
        int[] nums={0,0,0,1,1,1,1,1,1};
        int target=1;
        System.out.println(find_ones_index(nums,target));
    }
    static int find_ones_index(int[] array,int target){
        int start=0;
        int end=array.length-1;
        int first_index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>array[mid]){
                start=mid+1;
            }
            else if(target==array[mid]){
                first_index=mid;
                end=mid-1;
            }
        }
        return first_index;
    }
}
