package oop.Interfaces.Interface_inheritance;

public interface Breaks {

    default void carBreaks(){
        System.out.println("Машина чинится");
    }

    default void carRepaired(){
        System.out.println("Машина и ломается и чинится, кароче сложная ситуация");
    }
}
