package Amazon_Practice.BinarySearch;

public class Book_pages_allocation {
    public static void main(String[] args) {
        int[] array={10,20,30,40};
        int k=2;
        System.out.println(allocate(array,k));
    }
    static int allocate(int[] array,int k){
        //first sarch max and sum of array
        int start=0;
        int end=0;
        for(int val:array){
            start=Math.max(val,start);
            end+=val;
        }

        while (start<end){
            int sum=0;
            int student=1;
            int mid=start+(end-start)/2;
            for(int num:array){
                if(sum+num>mid){
                    sum=num;
                    student++;
                }else{
                    sum+=num;
                }
            }
            if(student>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
}
