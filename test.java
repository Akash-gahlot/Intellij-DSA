public class test {
    public static void main(String[] args) {
        int[] arr={5,4,2,7,8,9,10,12,3};
        System.out.println(find_max_triplet((arr)));
    }
    private static int  find_max_triplet (int[] arr){
        int sum=0;
        int max=arr[0];
        int i=0;


        for(int j=0;j<3;j++) {
            for ( i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];

                }
            }
            arr[i-1]=0;
            sum+=max;
            max=arr[0];

        }
        return sum;
    }
    //arr={5,4,2,7,8,9,10,12,3};
    //an unsorted array of unique elements , find the triplet from array. ,sum of triplet should be max.
}
