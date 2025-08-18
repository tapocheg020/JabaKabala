package Ablazzing.Abstract;

public abstract class  Dog extends Alive {
    public int countLegs = 4;
    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    static {
        System.out.println("----------------------------------------------------");
    }

    public void bark(String name, int age) {
        System.out.printf("%s - собака создалась, ей %d лет \n", name, age);
    }

    public abstract void run();
}
