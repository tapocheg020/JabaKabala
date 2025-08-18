package Ablazzing.Abstract;

public class Shepherd extends Dog {

    public Shepherd(){
        super(32);
//        System.out.printf("%d зуба у Овчарки\n", countTeeth);
    }

    @Override
    public void run() {
        System.out.println("Овчарка бегает не совсем быстро, но зато используется в органах");
    }

    @Override
    public void breath() {
        System.out.println("Овчарка дышит громко и часто, потому что собака большая ");
    }

    @Override
    public void bark(String name, int age){
        System.out.printf("Перезапись метода - %s - собака создалась, ей %d лет \n", name, age);
    }
}

//74 lesson