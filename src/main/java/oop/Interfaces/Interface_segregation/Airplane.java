package oop.Interfaces.Interface_segregation;

public class Airplane implements Driveable, Flyable {
   @Override
    public void drive() {
        System.out.println("Airplane driving");
    }

    @Override
    public void fly() {
       System.out.println("Airplane flying");
    }
}
