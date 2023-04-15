package REcursion;

public class SumTriangle {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int[][] nums2=new int[nums.length][5];
        //SumIt(nums,nums2,nums.length-1,5);
        System.out.println(nums2);
    }
    /*static void SumIt(int[] nums,int[][] nums2,int row,int col){
        if(row==-1){
            return;
        }
        if(row==nums.length-1){
            for(int i=0;i<nums.length;i++){
                nums2[row][i]=nums[i];
            }
            SumIt(nums,nums2,row-1,col-1);
        }
        for(int i=0;i<col-1;i++){
            nums2[row][i]=nums2[row+1][i]+nums2[row+1][i+1];
        }
        SumIt(nums,nums2,row-1,col-1);
    }*/
}
