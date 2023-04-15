package OOPS;
import java.util.*;      //program specifies the creation of employee and entering their details and adding them into array of clas type.

public class Employee {
    long ID;
    String name;
    String city;
    String Department;
    Employee(long id,String nm,String cty,String dpt){
        this.ID=id;
        this.name=nm;
        this.city=cty;
        this.Department=dpt;
    }


    private static Employee createEmployee(){    // a function to create Employee
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter employee id :");
        long id=sc.nextLong();
        System.out.println("Enter employee name :");
        String name=sc.next();
        System.out.println("Enter employee city :");
        String city=sc.next();
        System.out.println("Enter employee department :");
        String  dpt=sc.next();
        Employee obj=new Employee(id,name,city,dpt);
        return obj;
    }

    private static void EmployeeArray(){    //a function to place employee in arrays
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size=sc.nextInt();
        Employee[] emp=new Employee[size];
        for(int i=0;i<size;i++){
            emp[i]=createEmployee();  //call createmployee method
        }

        for(int i=0;i<size;i++){
            System.out.println(emp[i].ID);     //a method to display all employee details
            System.out.println(emp[i].name);
            System.out.println(emp[i].city);
            System.out.println(emp[i].Department);
            System.out.println();
        }

    }
    public static void main(String[] args) {
        EmployeeArray();   //function call

    }
}
