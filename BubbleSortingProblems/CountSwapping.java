package BubbleSortingProblems;

public class CountSwapping {
    public static void main(String[] args) {
        int[] nums={8, 22, 7, 9, 31, 5, 13 };
        System.out.println(bubblesort(nums));

    }
    static int bubblesort(int[] nums){
        int countswap=0;
        //initialize the outer loop
        for(int i=0;i< nums.length;i++){
            //initialzie the comparison loop
            //compare j value with its previous value that is j-1;
            for(int j=1;j< nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];   //swapping of values
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    countswap++;
                }
            }
        }
        return countswap;
    }

}
