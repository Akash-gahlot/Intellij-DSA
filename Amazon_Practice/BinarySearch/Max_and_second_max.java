package Amazon_Practice.BinarySearch;

import java.util.ArrayList;

public class Max_and_second_max {
    public static void main(String[] args) {
        int[] arr={2,1,2};
        ArrayList<Integer> list=new ArrayList<Integer>();
        int lsf=arr[0];     //lsf=largest element so far
        int slf=-1;         //smallest element so far
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lsf){
                slf=lsf;
                lsf=arr[i];
            }
            else if(arr[i]<lsf){
                if(arr[i]>slf){
                    slf=arr[i];
                }
            }
        }
        list.add(0,lsf);
        list.add(1,slf);
        System.out.println(list.toString());

    }
}
