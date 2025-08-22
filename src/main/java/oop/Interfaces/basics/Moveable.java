package oop.Interfaces.basics;

public interface Moveable  {
    void move();

    default void back() {
        System.out.println("Возвращается назад");
    }

}
