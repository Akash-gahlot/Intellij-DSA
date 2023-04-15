package Amazon_Practice.BinarySearch;

import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int[][] array={{10,20,30,40},
                       {15,22,32,43},
                       {17,24,35,45},
                       {19,28,39,48}};
        int target=20;
        System.out.println(Arrays.toString(find_element(array,target)));

    }
    static int[] find_element(int[][] array,int target){
        int start=0;
        int end=array[0].length-1;
        while (start<=end){
            if(target>array[start][end]){
                start=start+1;
            }
            else if(target<array[start][end]){
                end=end-1;
            }
            else if(target==array[start][end]){
                return new int[]{start,end};
            }
        }
        return new int[]{-1,-1};
    }
}
