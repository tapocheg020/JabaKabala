package Ablazzing.Abstract;

import Ablazzing.Abstract.dogs.Pitbull;
import Ablazzing.Abstract.defend_dogs.Shepherd;

public class Runner {
    public static void main(String[] args) {
        Shepherd shepherd = new Shepherd();
        shepherd.bark("Овчарка", 6);
        shepherd.run();
        shepherd.breath();
        System.out.println(shepherd.countTeeth);
        System.out.println("------------");
        shepherd.beAngry();


        System.out.println("-----------------------------------");


        Pitbull pitbull = new Pitbull();
        pitbull.bark("Питбуль", 3);
        pitbull.run();
        pitbull.breath();
        System.out.println(pitbull.countTeeth);
        System.out.println("------------");
        pitbull.beAngry();

    }
}
