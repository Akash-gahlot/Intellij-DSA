package Amazon_Practice.BinarySearch;

public class min_dist_btw_2no {
    public static void main(String[] args) {
        int n=7;
        int[] a={86,39,84,35,62,48,90};
        int x=42;
        int y=86;
        System.out.println( minDist(a,n,x,y));
    }
   static int minDist(int a[], int n, int x, int y) {
        // code here
        int dist=0;
        int indexX=-1;
        int indexY=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                indexX=i;
            }
            else if(a[i]==y) {
                indexY = i;
            }
            if(indexX!=-1 && indexY!=-1){
                if(Math.abs(indexY-indexX)<dist || dist==0){
                    dist=Math.abs(indexY-indexX);
                }
            }
        }
        if((indexX==-1) || (indexY==-1)) {
            return -1;
        }
        return dist;
    }


}
