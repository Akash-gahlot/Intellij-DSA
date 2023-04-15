package OOPS;

public class Box2 extends Box{
    public static void main(String[] args) {
        Box obj=new Box();
        obj.name="Main Object";

        Box obj2=new Box();
        obj2.name="Object1";
        System.out.println(obj2.name);   //Change the object name by referencing it to other object name.

        obj2.assignbox(obj);
        System.out.println(obj2.name);

    }
}
