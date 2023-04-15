package Amazon_Practice.BinarySearch;

public class find_peak_element {
    public static void main(String[] args) {
        int[] nums={5,15,20,90,70,40,50};
        System.out.println(search_index(nums));
    }
    static int search_index(int[] array){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && mid<array.length-1){  //search in btwn of start and and values
                if(array[mid]>array[mid+1] && array[mid]>array[mid-1]){
                    return mid;
                }
                else if(array[mid]<array[mid-1]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(mid==0){
                if(array[mid]>array[mid+1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else if(mid==array.length-1){
                if(array[mid]>array[mid-1]){
                    return mid;
                }
                else {
                    return array[mid-1];
                }
            }
        }
        return -1;
    }
}
