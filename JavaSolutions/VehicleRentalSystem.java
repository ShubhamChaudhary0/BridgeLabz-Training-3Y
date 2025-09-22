import java.util.*;

interface Rentable {
    void rent();
}
class Car implements Rentable {
    String model; Car(String m){model=m;}
    public void rent(){System.out.println("Car "+model+" rented!");}
}
class Bike implements Rentable {
    String model; Bike(String m){model=m;}
    public void rent(){System.out.println("Bike "+model+" rented!");}
}
public class VehicleRentalSystem {
    public static void main(String[] args){
        Rentable v1=new Car("Sedan");
        Rentable v2=new Bike("Yamaha");
        v1.rent(); v2.rent();
    }
}
