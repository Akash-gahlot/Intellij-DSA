package TCS;

public class Vehicle_wheels {
    public static void main(String[] args) {
        int total_vehicle=202;
        int total_wheels=546;
        two_four_vehicle(total_vehicle,total_wheels);
    }
    static void two_four_vehicle(int v1,int v2){
        int two_wheeler=0;
        int four_wheeler=0;
        four_wheeler=(v2/2)-v1;
        two_wheeler=v1-four_wheeler;
        System.out.println("Two wheeler vehicle : "+two_wheeler +"  Four wheeler vehicle : "+four_wheeler);
    }
}
