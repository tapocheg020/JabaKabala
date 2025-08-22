package oop.Interfaces.Interface_inheritance;

public interface Repaired {

    default void carRepaired(){
        System.out.println("Машина ломается");
    }
}
