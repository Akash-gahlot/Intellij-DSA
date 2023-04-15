package Amazon_Practice.BinarySearch;

public class gfg_array_8 {
    public static void main(String[] args) {
              int n=84;
              int[] A={887, 778, 916, 794, 336 ,387 ,493 ,650, 422, 363, 28 ,691, 60, 764, 927, 541 ,427, 173, 737 ,212, 369 ,568, 430 ,783 ,531,
                   863 ,124 ,68 ,136 ,930 ,803 ,23 ,59 ,70 ,168 ,394 ,457, 12 ,43 ,230, 374, 422 ,920 ,785 ,538 ,199, 325 ,316 ,371 ,414 ,527, 92,
                  981 ,957 ,874 ,863 ,171 ,997 ,282 ,306 ,926 ,85 ,328 ,337 ,506 ,847 ,730 ,314 ,858, 125 ,896 ,583 ,546 ,815 ,368 ,435, 365, 44 ,
                      751, 88 ,809, 277 ,179, 789,888};
        System.out.println(max_sum(A,n));
    }
    static int max_sum(int A[], int n)                   //1805686
    {
        // Your code here
        int max_index=0;
        int sum=0;
        for(int i=1;i<n;i++){
            if(A[i]>A[max_index]){
                max_index=i;
            }
        }
        int j=0;
        while(j<n){
            sum=sum+(j*A[(max_index+j+1)%n]);
            j++;
        }
        return sum;
    }
}
