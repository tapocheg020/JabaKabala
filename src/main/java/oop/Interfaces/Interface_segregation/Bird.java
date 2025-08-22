package oop.Interfaces.Interface_segregation;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}
