package Amazon_Practice.BinarySearch;

public class first_last_occurence {
    public static void main(String[] args) {
        int[] array={1,2,3,4,4,4,4,5};
        int target=4;
        int left=search(array,target,true);
        int right=search(array,target,false);
        System.out.println("first_occurence_place :"+left+" "+"last_occurence_value :"+right);
    }
    static int search(int[] array,int target,boolean left){
        int start=0;
        int end= array.length-1;
        int mid=0;
        int ans=-1;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target<array[mid]){
                end=mid-1;
            }
            else if(target>array[mid]){
                start=mid+1;
            }
            else {
                ans=mid;
                if(left){
                    end = mid - 1;
                }
                start=mid+1;

            }
        }
        return ans;
    }

}
