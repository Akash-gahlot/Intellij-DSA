package Dynamic_Programming;

public class function {
    private int a;
    private int b;
    private void sum(int val1,int val2){
        System.out.println(val1+val2);
        subtract(val1,val2);
    }
    private void subtract(int val1,int val2){
        System.out.println(val1-val2);
        sum(val1+1,val2+1);
    }

    public static void main(String[] args) {
        function obj=new function();
        obj.a=1;
        obj.b=2;
        obj.sum(obj.a,obj.b);
    }

}
