package OOPS;

public class OOPS2 {
    static String name="Akash";  //properties which are common for all objects should be declare as static
    public static void main(String[] args) {
        OOPS2 obj=new OOPS2();
        System.out.println(name);
       // employee emp=new employee();
        //System.out.println(employee.name);  //a static member cannot reference non-static member
        System.out.println(employee.company);

    }

      class employee{         //this class has to be declared as static to access name property from it
        String name="Vikash";
        static String company="Wipro";


    }
}
