package oop.Interfaces.Practice;

import oop.Polymorfizm.Animal;

public class Fish implements Swimable {

    @Override
    public void floatingAnimal(){
        System.out.println("Рыба плавает");
    }
}
