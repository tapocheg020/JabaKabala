package Ablazzing.Abstract.dogs;

import Ablazzing.Abstract.Alive;

import javax.swing.plaf.PanelUI;

public abstract class  Dog extends Alive {
    protected final int COUNT_LEGS = 4;
    public int countTeeth;
    public static final String LATIN_NAME = "ХУЙ ЗНАЕТ во заебис";


    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    static {
        System.out.println("----------------------------------------------------");
    }

    public void beAngry() {
        System.out.println("Собака рычит жоска");
    }

    public void bark(String name, int age) {
        System.out.printf("%s - собака создалась, ей %d лет \n", name, age);
    }

    public abstract void run();
}
