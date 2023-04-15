package OOPS;

public class OOPS1 {
    public static void main(String[] args) {
        /*Student s1=new Student("Akash","Delhi",21);
        Student s2=s1;   //her new object s2 is referenecing to object s1.
        System.out.println(s2.city);
        s1.changecity("Meerut");
        System.out.println(s1.city);
        System.out.println(s2.city);*/


        Student s1=new Student(); //just a object is created a constructor is called.
        System.out.println(s1.name);
        /*int a;
        System.out.println(a);*/  // as a is not initialized it will show error here
        System.out.println(s1);

    }

}
class Student{
    String name;
    String city;
    int age;
    String school=new String();
    //constructor
    /*public Student(String nm,String cty,int ag){
        this.name=nm;
        this.city=cty;
        this.age=ag;
    }
    public void changecity(String City){
        this.city=City;
    }*/
    Student(){
        System.out.println("Constructor call there after initialization of object");
    }
}