package code_signal;

public class Trees {
    public static void main(String[] args) {
        int[] a={-1, 150, 190, 170, -1, -1, 160, 180};
        set_people(a);
        for (int val:
             a) {
            System.out.println(val);

        }
    }
    static int[] set_people(int[] a){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            if(a[left]==-1){
                left++;
            }
            else if(a[right]==-1){
                right--;
            }
            else{
                insertion_sort(a,left,right);
                left++;
            }
        }
        return a;
    }

    static void insertion_sort(int[] a,int left,int right){
        for(int ind=right;ind>=left;ind--){
            if(a[ind]!=-1 && a[ind]<a[left]){
                swap(a,ind,left);
            }
        }
    }
    static void swap(int[] a ,int ind,int left){
        int temp=a[ind];
        a[ind]=a[left];
        a[left]=temp;
    }
}
