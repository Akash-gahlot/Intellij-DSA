package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Box box1=new Box();

        //make cube
        Box box2=new Box(5);

        //make cuboid

        Box box3=new Box(1,2,3);

        Box box4=new Box(box3);
        System.out.println(box4.w);
        System.out.println(box4.h);

    }
}
class Box{
    int l;
    int w;
    int h;
    String name;

    Box(){
        System.out.println("Constructor overloading");
    }
    Box(int side){
        this.h=side;
    }
    Box(int length,int width,int height){
        this.l=length;
        this.w=width;
        this.h=height;
    }
    Box(Box obj){
        this.w=obj.w; //hence only width of old box will get assign to new box.
    }
    public void assignbox(Box obj){
        this.name=obj.name;
    }

}
