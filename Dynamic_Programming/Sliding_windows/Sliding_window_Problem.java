package Dynamic_Programming.Sliding_windows;

public class Sliding_window_Problem {
    public static void main(String[] args) {
        int[] nums={ 1, 4, 2, 10, 2, 3, 1, 0, 20};
        int n=4;
        int max=0;
        int sum=0;
        /*for(int i=0;i<nums.length-n+1;i++){
            int sum=0;                   Approach 1
            for(int j=0;j<n;j++){
                sum=sum+nums[j+i];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);*/


        //Sliding window approach
        for(int i=0;i<n;i++){
            sum=sum+nums[i];        //Calculate the sum of 1st window
        }
        max=sum;

        //now calculate the sum of other windows
        int window_sum=max;
        for(int j=n;j<nums.length;j++){
            window_sum+=nums[j]-nums[j-n];
            max=Math.max(max,window_sum);
        }
        System.out.println(max);
    }
}
