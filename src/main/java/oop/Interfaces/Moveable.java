package oop.Interfaces;

public interface Moveable  {
    public void move();

    default void back() {
        System.out.println("Возвращается назад");
    }

}
