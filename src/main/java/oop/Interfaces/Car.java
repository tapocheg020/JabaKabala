package oop.Interfaces;

public class Car implements Moveable {

    public void move(){
        System.out.println("Обычная машина ну бмв м5 ну едет, может лететь, но не как болид");
    }

    @Override
    public void back() {
        System.out.println("Бмв возвращается назад");
    }
}
