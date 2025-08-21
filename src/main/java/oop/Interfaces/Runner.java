package oop.Interfaces;

public class Runner {
    public static void main(String[] args) {
        Moveable bmwM5 = new Car();
        Moveable redBull = new BolidFormula1();

        Moveable[] moveables = {redBull, bmwM5};
        for(Moveable moveable : moveables){
            moveable.move();
            moveable.back();
        }
    }
}
