package Amazon_Practice.BinarySearch;

public class Search_in_biotonic {
    public static void main(String[] args) {
        int[] array={2,4,5,7,8,10,12,16,17,19,14,13,6,3,1,0,-8};
        int target=0;
        int peak_index=find_max(array);
        int left_search=find_target(array,target,0,peak_index,true);
        int right_search=find_target(array,target,peak_index+1,array.length-1,false);
        if(left_search!=-1){
            System.out.println(left_search);
        }
        else{
            System.out.println(right_search);
        }
    }

    ///1...first find the index value of peak element
    static int find_max(int[] array){
        int start=0;
        int end=array.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]>array[mid+1] && array[mid]>array[mid-1]){
                return mid;
            }
            else if(array[mid]>array[mid-1]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    ///2...find the target value to the left of peak and to the right of peak element
    static int find_target(int[] array,int target,int start,int end,boolean left){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==array[mid]){
                return mid;
            }
            else{
                if(left){
                    if(target>array[mid]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
                else{
                    if(target>array[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }

        }
        return -1;
    }
}
