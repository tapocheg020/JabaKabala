package Ablazzing.Abstract.dogs;

public class Pitbull extends Dog {

    public Pitbull(){
        super(28);
//        System.out.printf("%s зубов у Питбуля\n", countTeeth);
    }

    @Override
    public void run() {
        System.out.println("Питбуль довольно быстр, но в органах встречается редко");
    }

    @Override
    public void breath() {
        System.out.println("Питбуль же собака по меньше и она дышит равномерно ");
    }

    @Override
    public void beAngry(){
        System.out.println("В дом зашли чужие люди, питбуль заметил их");
        super.beAngry();
        System.out.printf("Чужие люди оказались родственниками, так же он стоит на " + super.COUNT_LEGS +  " лапах и поэтому хозяин приказал собаке место");
    }
}
