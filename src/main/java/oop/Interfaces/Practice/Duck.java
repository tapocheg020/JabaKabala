package oop.Interfaces.Practice;

public class Duck implements Flyable, Swimable {

    @Override
    public void flyingAnimal() {
        System.out.println("Утка летает");
    }

    @Override
    public void floatingAnimal() {
        System.out.println("Утка плавает");
    }

}
