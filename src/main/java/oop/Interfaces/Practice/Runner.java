package oop.Interfaces.Practice;

public class Runner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        Swimable[] swimpool = { duck, fish};
        Flyable[] sky = {duck, airplane};

        for (Swimable swimable : swimpool) {
            swimable.floatingAnimal();
        }

        for (Flyable flyable : sky) {
            flyable.flyingAnimal();
        }


    }
}
