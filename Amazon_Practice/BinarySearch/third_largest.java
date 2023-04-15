package Amazon_Practice.BinarySearch;

public class third_largest {
    public static void main(String[] args) {
        int[] a={2,4,1,3,5,8};
      int ans=  thirdLargest(a,5);
        System.out.println(ans);
    }

   static int thirdLargest(int a[], int n)
    {
        // Your code here
        int lsf=a[0];
        int slf=-1;
        int tlf=-1;
        int c=1;
        if(a.length<3){
            return -1;
        }
        else{
            for(int i=1;i<a.length;i++){
                if(c<3){
                    if(a[i]>lsf){
                        slf=lsf;
                        lsf=a[i];
                        c++;
                    }
                    else if(a[i]<lsf){
                        if(a[i]>slf){
                            slf=a[i];
                            c++;
                        }
                    }

                }
                else {
                    if(a[i]>lsf){
                        tlf=slf;
                        slf=lsf;
                        lsf=a[i];
                    }
                    else if(a[i]<lsf){
                        if(a[i]>slf){
                            tlf=slf;
                            slf=a[i];
                        }
                    }
                }

            }

        }
        return tlf;

    }
}



