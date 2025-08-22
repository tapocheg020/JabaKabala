package oop.Interfaces.Interface_inheritance;

public interface TechnicalInspection extends Repaired, Breaks {

    @Override
    default void carRepaired() {
        Breaks.super.carRepaired();
    }

}

//lesson 87