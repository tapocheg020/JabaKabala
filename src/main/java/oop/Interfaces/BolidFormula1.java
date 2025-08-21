package oop.Interfaces;

public class BolidFormula1 implements Moveable  {

    public void move(){
        System.out.println("Болид ферстапена летит со скоростью света");
    }

    @Override
    public void back(){
        System.out.println("Болид ред булла возвращается назад");
    }

}
