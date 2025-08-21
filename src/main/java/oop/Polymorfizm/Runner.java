package oop.Polymorfizm;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        feedTwoAnimals(dog, cat);

    }

    public static void feedTwoAnimals(Animal animalOne, Animal animalTwo) {
        animalOne.eat();
        animalTwo.eat();
    }
}
